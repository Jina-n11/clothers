package com.example.weather.domain.model

import com.google.gson.annotations.SerializedName

data class MainWeather (
//    @SerializedName("wind") val wind: Wind,
//   // val rain :Rain,
//    @SerializedName("clouds") val clouds: Clouds,
//    @SerializedName("name") val name: String,
//    @SerializedName("weather") val weather: List<Weather>,
//    @SerializedName("base") val base: String,
//    @SerializedName("main") val main: Main,
//    @SerializedName("sys") val sys: Sys,
//    @SerializedName("cod") val cod: Int,
//    @SerializedName("coord") val coord: Coord,
//    @SerializedName("visibility") val visibility: Int,
//    @SerializedName("id") val id: Int,
//    @SerializedName("dt") val dateTime: Long,
//    @SerializedName("timezone") val timezone: Long,
//    @SerializedName("message") val message: String,

//    @SerializedName("dt")
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


//"cod": "200",
//"message": 0,
//"cnt": 40,
//"list": []
//"city": {}




//Clouds
//Clear
//Rain



//sunny, rainy, windy, stormy, and cloudy

//
//fun Double.toCelsius () : Double {
//    return String.format("%.2f", (this - 273.15)).toDouble()
//}
//
//fun Double.toPercent () : Double {
//    return String.format("%.2f", (this/100)).toDouble()
//}


//{
//    "coord": {
//    "lon": 44.4009,
//    "lat": 33.3406
//},
//    "weather": [
//    {
//        "id": 800,
//        "main": "Clear",
//        "description": "clear sky",
//        "icon": "01d"
//    }
//    ],
//    "base": "stations",
//    "main": {
//    "temp": 301.1,
//    "feels_like": 299.97,
//    "temp_min": 301.1,
//    "temp_max": 301.1,
//    "pressure": 1017,
//    "humidity": 24
//},
//    "visibility": 10000,
//    "wind": {
//    "speed": 1.54,
//    "deg": 250
//},
//    "clouds": {
//    "all": 0
//},
//    "dt": 1680951094,
//    "sys": {
//    "type": 1,
//    "id": 7597,
//    "country": "IQ",
//    "sunrise": 1680921691,
//    "sunset": 1680967611
//},
//    "timezone": 10800,
//    "id": 98182,
//    "name": "Baghdad",
//    "cod": 200
//}

//
//* {
//    "coord": {
//        "lon": 28.9833,
//        "lat": 41.0351
//    },
//    "weather": [
//    {
//        "id": 800,
//        "main": "Clear",
//        "description": "clear sky",
//        "icon": "01n"
//    }
//    ],
//    "base": "stations",
//    "main": {
//        "temp": 296.83,
//        "feels_like": 297.16,
//        "temp_min": 294.24,
//        "temp_max": 296.83,
//        "pressure": 1013,
//        "humidity": 73
//    },
//    "visibility": 10000,
//    "wind": {
//        "speed": 3.09,
//        "deg": 60
//    },
//    "clouds": {
//        "all": 0
//    },
//    "dt": 1659472435,
//    "sys": {
//        "type": 1,
//        "id": 6970,
//        "country": "TR",
//        "sunrise": 1659409234,
//        "sunset": 1659460801
//    },
//    "timezone": 10800,
//    "id": 745042,
//    "name": "Istanbul",
//    "cod": 200
//}