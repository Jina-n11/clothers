package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class DailyWeather(
    @SerializedName("dt")
    val dt: Long,
    @SerializedName("main")
    val main: Main,
    @SerializedName("weather")
    val weather: List<Weather>,
    @SerializedName("clouds")
    val clouds: Clouds,
    @SerializedName("wind")
    val wind: Wind,
    @SerializedName("visibility")
    val visibility : Int,
    @SerializedName("pop")
    val pop: Double,
    @SerializedName("sys")
    val sys: Sys,
    @SerializedName("dt_txt")
    val dtTxt: String,
)

//"dt": 1680944400,
//"main": { },
//"weather": [],
//"clouds": {},
//"wind": {},
//"visibility": 10000,
//"pop": 0,
//"sys": {},
//"dt_txt": "2023-04-08 09:00:00"

