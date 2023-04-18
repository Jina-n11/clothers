package com.example.weather.domain.interactor

import com.example.weather.data.util.Status
import com.example.weather.domain.model.MainWeather

class GetWeatherInteractor(
    private val weatherDataSource: WeatherRepository,
) {
    operator fun invoke(): Status<MainWeather> {
        return weatherDataSource.getWeather()
    }
}