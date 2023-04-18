package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class Sys(
//    val type: Int,
//    val id: Int,
//    val country: String,
//    val sunrise: Long,
//    val sunset: Long

    @SerializedName("pod")
    val pod : String,
)

//"sys": {
//    "pod": "n"
//},

