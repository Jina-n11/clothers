package com.example.weather.data.repository

import com.example.weather.data.util.Status
import com.example.weather.data.remote.WeatherClient
import com.example.weather.domain.interactor.WeatherRepository
import com.example.weather.domain.model.MainWeather

class WeatherRepositoryImpl (private val weatherClient: WeatherClient): WeatherRepository {
    override fun getWeather(): Status<MainWeather> {
        return weatherClient.getWeather()
    }
}