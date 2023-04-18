package com.example.weather.domain.interactor

import com.example.weather.data.util.Status
import com.example.weather.domain.model.MainWeather

interface WeatherRepository {
    fun getWeather() : Status<MainWeather>
}