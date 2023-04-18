package com.example.weather.util

object ApiConstants {
    const val SCHEMA = "https"
    const val HOST = "api.openweathermap.org"
    const val PATH = "data/2.5/forecast"
    const val ACCEPT ="Accept"
    const val TYPE = "application/json"
}
object Params{
    const val CITY="q"
    const val APP_ID="appid"

    object Values{
        const val CITY  = "Baghdad"
    }
}