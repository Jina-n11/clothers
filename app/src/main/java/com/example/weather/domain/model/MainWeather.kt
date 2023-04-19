package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class MainWeather (
    @SerializedName("cod")
    val cod: String,
    @SerializedName("message")
    val message: Int,
    @SerializedName("cnt")
    val cnt: Int,
    @SerializedName("list")
    val dailyWeather: List<DailyWeather>,
    @SerializedName("city")
    val city: City,
)