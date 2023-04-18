package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class Clouds(
//    val all: Double,
    @SerializedName("all")
    val all: Int,
)

//"clouds": {
//    "all": 0
//},
