package com.example.weather.presentation.presenter.weather
import com.example.weather.data.repository.WeatherRepositoryImpl
import com.example.weather.data.remote.WeatherClientImpl
import com.example.weather.data.util.Status
import com.example.weather.domain.interactor.GetWeatherInteractor
import com.example.weather.domain.model.MainWeather

class WeatherPresenter(
    private val view: WeatherView,
) {

    val weatherRepositoryImpl = WeatherRepositoryImpl(WeatherClientImpl())
    private var getWeatherInteractor = GetWeatherInteractor(weatherRepositoryImpl)

     fun getWeather() {
        val status = getWeatherInteractor.invoke()
         when (status) {
             is Status.Loading -> view.onLoading()
             is Status.Success -> view.onSuccess(status.data)
             else -> {
                 view.onFailure()
             }
         }
    }

    fun getWeatherInfo(weather: MainWeather){
        view.getWeatherInfo(weather)
    }
}