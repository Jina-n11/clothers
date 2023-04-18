package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class Coord(
//    val lon: Double,
//    val lat: Double,
    @SerializedName("lat")
    val lat : Double,
    @SerializedName("lon")
    val lon : Double,
)
