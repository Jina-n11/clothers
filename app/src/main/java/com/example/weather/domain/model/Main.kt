package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class Main(
//    @SerializedName("temp") val temp: Double,
//    @SerializedName("feels_like") val feelsLike: Double,
//    @SerializedName("temp_min") val tempMin: Double,
//    @SerializedName("temp_max") val tempMax: Double,
//    @SerializedName("pressure") val pressure: Double,
//    @SerializedName("humidity") val humidity: Int,

    @SerializedName("temp")
    var temp: Double,
    @SerializedName("feels_like")
    var feelsLike: Double,
    @SerializedName("temp_min")
    var tempMin: Double,
    @SerializedName("temp_max")
    var tempMax: Double,
    @SerializedName("pressure")
    var pressure: Double,
    @SerializedName("sea_level")
    var seaLevel: Int,
    @SerializedName("grnd_level")
    var grndLevel: Int,
    @SerializedName("humidity")
    var humidity: Double,
    @SerializedName("temp_kf")
    var tempKf: Double,
)



//"main": {
//    "temp": 265.95,
//    "feels_like": 261.55,
//    "temp_min": 264.44,
//    "temp_max": 265.95,
//    "pressure": 1021,
//    "sea_level": 1021,
//    "grnd_level": 958,
//    "humidity": 87,
//    "temp_kf": 1.51
//},


