package com.example.weather.presentation.presenter.weather
import com.example.weather.data.repository.WeatherRepositoryImpl
import com.example.weather.data.remote.WeatherClientImpl
import com.example.weather.domain.interactor.GetWeatherInteractor
import com.example.weather.domain.model.MainWeather

class WeatherPresenter(
    private val view: WeatherView,
) {

    val weatherRepositoryImpl = WeatherRepositoryImpl(WeatherClientImpl())
    private var getWeatherInteractor = GetWeatherInteractor(weatherRepositoryImpl)

     fun getWeather() {
        val result = getWeatherInteractor.invoke()
        view.onState(result)
    }

    fun getWeatherInfo(weather: MainWeather){
        view.getWeatherInfo(weather)
    }
}