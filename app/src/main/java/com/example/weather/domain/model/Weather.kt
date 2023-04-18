package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class Weather(
//    //    val id: Int,
//    val main: String,
//    val description: String,
////    val icon: String

    @SerializedName("id")
    val id: Int,
    @SerializedName("main")
    val main: String,
    @SerializedName("description")
    val description: String,
    @SerializedName("icon")
    val icon: String,
)

//"weather": [
//{
//    "id": 800,
//    "main": "Clear",
//    "description": "clear sky",
//    "icon": "01n"
//}
//],


