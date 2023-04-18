package com.example.weather.presentation.presenter.weather

import com.example.weather.data.util.Status
import com.example.weather.domain.model.MainWeather

interface WeatherView {
    fun getWeatherInfo(weather: MainWeather)
    fun onState(status: Status<MainWeather>)
}