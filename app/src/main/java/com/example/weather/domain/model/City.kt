package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class City(
    @SerializedName("id") 
    val id: Int,
    @SerializedName("name") 
    val name: String,
    @SerializedName("coord") 
    val coord: Coord,
    @SerializedName("country") 
    val country: String,
    @SerializedName("population") 
    val population: Int,
    @SerializedName("timezone") 
    val timezone: Int,
    @SerializedName("sunrise") 
    val sunrise: Long,
    @SerializedName("sunset") 
    val sunset: Long,
)

//"city": {
//    "id": 5688025,
//    "name": "Bismarck",
//    "coord": {
//        "lat": 46.8083,
//        "lon": -100.7837
//    },
//    "country": "US",
//    "population": 61272,
//    "timezone": -18000,
//    "sunrise": 1680955737,
//    "sunset": 1681003239
//}
