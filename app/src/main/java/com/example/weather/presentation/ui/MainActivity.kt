package com.example.weather.presentation.ui

import android.os.Build
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.example.weather.R
import com.example.weather.data.fake_data.ClothesSuggester
import com.example.weather.data.util.Status
import com.example.weather.databinding.ActivityMainBinding
import com.example.weather.domain.model.MainWeather
import com.example.weather.domain.model.WeatherState
import com.example.weather.presentation.presenter.clothes_suggester.ClothesSuggesterPresenter
import com.example.weather.presentation.presenter.clothes_suggester.ClothesSuggesterView
import com.example.weather.presentation.presenter.weather.WeatherPresenter
import com.example.weather.presentation.presenter.weather.WeatherView
import com.example.weather.util.extention.hide
import com.example.weather.util.extention.show
import com.example.weather.util.extention.toCelsius
import com.example.weather.util.extention.toPercent
import convertDateFormat
import spleitDateTime
import java.time.LocalDateTime
import java.time.ZoneOffset
import java.util.*

@RequiresApi(Build.VERSION_CODES.O)
class MainActivity : AppCompatActivity(), WeatherView, ClothesSuggesterView {

    private val presenterWeather = WeatherPresenter(this)
    private val presenterClothesSuggester = ClothesSuggesterPresenter(this , this)
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setUp()
    }

    private fun setUp() {
        Thread {
            presenterWeather.getWeather()
        }.start()
    }

    override fun onState(status: Status<MainWeather>) {
        when (status) {
            is Status.Loading -> onLoading()
            is Status.Success -> onSuccess(status.data)
            else -> {
                onFailure()
            }
        }
    }

    private fun onSuccess(data: MainWeather) {
        runOnUiThread {
            binding.viewBackground.hide()
            presenterWeather.getWeatherInfo(data)
            presenterClothesSuggester.checkClothesSuggester(data)
        }
    }

    private fun onLoading() {
        runOnUiThread {
            binding.lottieLoadingWeather.show()
            binding.viewBackground.show()
        }
    }

    private fun onFailure() {
        runOnUiThread {
            binding.viewBackground.show()
            binding.noInternetConnection.show()
            binding.lottieLoadingWeather.hide()
        }
    }


     override fun getWeatherInfo(data: MainWeather) {
        runOnUiThread{
            val weather = data.dailyWeather[0]
            binding.apply {
                textViewValuePressure.text = weather.main.pressure.toPercent()
                textViewValueClouds.text = weather.clouds.all.toDouble().toPercent()
                textViewValueWind.text = "${weather.wind.speed} km/h"
                textViewValueHumidity.text = "${weather.main.humidity.toPercent()} %"
                textViewMaxMinTemp.text = "${weather.main.tempMax.toCelsius()}ْ  / ${weather.main.tempMin.toCelsius()}ْ "
                textViewFeelsLike.text = "${weather.main.feelsLike.toCelsius()}ْ  Feels like"
                textViewCityName.text = "${data.city.name}, ${data.city.country}"
                textViewDescriptionWeather.text = "${weather.weather[0].description}"
            }
            getWeatherStatus(weather.weather[0].main)
        }
    }

    private fun getWeatherStatus(mainWeather: String) {
        when (mainWeather.uppercase()) {
            WeatherState.CLOUDS.toString() -> {
                binding.weather.setAnimation(R.raw.cloudy)
            }
            WeatherState.CLEAR.toString() -> {
                binding.weather.setAnimation(R.raw.sun_with_cloud)
            }
            WeatherState.RAIN.toString() -> {
                binding.weather.setAnimation(R.raw.rainny_day)
            } else -> {
               binding.weather.setAnimation(R.raw.iced)
            }
        }
        binding.weather.playAnimation()
    }


    override fun getClothesSuggester(clothesSuggester: ClothesSuggester) {
        runOnUiThread {
            Glide
                .with(this)
                .load(clothesSuggester.image)
                .centerCrop()
                .placeholder(R.drawable.hanger)
                .into(binding.imageViewClothesSuggest)
        }
    }
}

