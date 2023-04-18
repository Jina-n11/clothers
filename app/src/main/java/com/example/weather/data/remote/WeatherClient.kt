package com.example.weather.data.remote

import com.example.weather.data.util.Status
import com.example.weather.domain.model.MainWeather
import com.google.gson.Gson
import okhttp3.OkHttpClient


interface WeatherClient {
    fun getWeather(): Status<MainWeather>
}

class WeatherClientImpl : WeatherClient {
    private val client = OkHttpClient()
    override fun getWeather(): Status<MainWeather> {
       return try {
            Status.Loading
            val response = client.newCall(RequestHelper.makeWeatherRequest()).execute()
            return if (response.isSuccessful) {
                Gson().fromJson(response.body?.string(), MainWeather::class.java).run {
                    Status.Success(this)
                }
            } else {
                Status.Fail(response.message)
            }

        } catch (e: Exception) {
            Status.Fail(e.message.toString())
        }
    }
}
