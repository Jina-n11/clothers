package com.example.weather.presentation.presenter.clothes_suggester

import android.content.Context
import android.os.Build
import androidx.annotation.RequiresApi
import com.example.weather.data.fake_data.ClothesList
import com.example.weather.data.fake_data.ClothesSuggester
import com.example.weather.data.local.WeatherSharedPreferences
import com.example.weather.domain.model.MainWeather
import com.example.weather.presentation.util.extention.toCelsius
import spleitDateTime
import java.time.LocalDateTime

@RequiresApi(Build.VERSION_CODES.O)
class ClothesSuggesterPresenter(
    private val view: ClothesSuggesterView,
    private val context: Context
) {

    private val preferences by lazy {
        WeatherSharedPreferences().also {
            it.initPreferences(context = context)
        }
    }


    fun checkClothesSuggester(data: MainWeather) {
        val clothesList = ClothesList().getList()
        var flag = true

        if (getDay() != LocalDateTime.now().dayOfWeek.toString()) {
            val clothesSuggester = getClothesSuggesterIsWear(clothesList = clothesList, id= getIdImage())
            if(flag){
                setupDay()
                setupIdImage(clothesSuggester.id)
                flag = false
            }

            view.getClothesSuggester(clothesSuggester)
        } else {
            val clothesSuggester = getClothesSuggesterRandom(clothesList= clothesList, data= data)
            view.getClothesSuggester(clothesSuggester)
            setupDay()
            setupIdImage(clothesSuggester.id)
        }

    }


    private fun getIdImage(): Int {
        return preferences.clothesId ?:-1
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun getDay(): String {
        return preferences.day ?: ""
    }

    private fun setupIdImage(id: Int) {
        preferences.clothesId = id
    }

    @RequiresApi(Build.VERSION_CODES.O)
    private fun setupDay() {
        preferences.day = LocalDateTime.now().plusDays(1).dayOfWeek.toString()
    }


    private fun getClothesSuggesterRandom(
        data: MainWeather,
        clothesList: List<ClothesSuggester>,
    ): ClothesSuggester {
        return clothesList.filter {
            it.id != getIdImage() &&
            data.dailyWeather[0].main.feelsLike.toCelsius().toInt() in it.minTemperature..it.maxTemperature
        }.random()
    }

    private fun getClothesSuggesterIsWear(
        id: Int,
        clothesList: List<ClothesSuggester>,
    ): ClothesSuggester {
        return clothesList.filter { it.id == id }.random()
    }
}


