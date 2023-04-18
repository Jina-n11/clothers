package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class Wind(
//    val speed: Double,
////    val deg: Int

    @SerializedName("speed")
    val speed: Double,
    @SerializedName("deg")
    val deg: Int,
    @SerializedName("gust")
    val gust: Double,
)


//"wind": {
//    "speed": 2.54,
//    "deg": 102,
//    "gust": 7.11
//}
