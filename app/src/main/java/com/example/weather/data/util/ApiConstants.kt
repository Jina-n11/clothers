package com.example.weather.util

object ApiConstants {
    const val SCHEMA = "https"
    const val HOST = "api.openweathermap.org"
    //const val PATH = "data/2.5/forecast"
    const val PATH = "data/2.5/forecast"

    const val ACCEPT ="Accept"
    const val TYPE = "application/json"

    const val CITY_NOT_FOUND = "city not found"
    const val TIME = 1
    const val INDEX_WEATHER = 0
    const val INDEX_COUNT_EMPTY = 0
}
object Params{
    const val CITY="q"
    const val APP_ID="appid"
//    const val UNITS = "units"

    object Values{
        const val CITY  = "Baghdad"
       // const val units = "metric"
    }
}

//https://api.openweathermap.org/data/2.5/forecast?q=Baghdad&appid=80b24620968518b5db2d270b3ff709e7



//LocalDateTime.ofEpochSecond(1681551738, 0, ZoneOffset.UTC)