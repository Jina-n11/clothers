package com.example.weather.data.remote

import com.example.weather.BuildConfig
import com.example.weather.util.ApiConstants.ACCEPT
import com.example.weather.util.ApiConstants.HOST
import com.example.weather.util.ApiConstants.PATH
import com.example.weather.util.ApiConstants.SCHEMA
import com.example.weather.util.ApiConstants.TYPE
import com.example.weather.util.Params
import com.example.weather.util.Params.APP_ID
import com.example.weather.util.Params.CITY
import okhttp3.HttpUrl
import okhttp3.Request

object RequestHelper {
    fun makeWeatherRequest(): Request {
        val url = HttpUrl.Builder()
            .scheme(SCHEMA)
            .host(HOST)
            .addPathSegment(PATH)
            .addQueryParameter(APP_ID, BuildConfig.API_KEY)
            .addQueryParameter(CITY, Params.Values.CITY)
            .build()
        return Request.Builder()
            .url(url)
            .get()
            .addHeader(ACCEPT, TYPE)
            .build()
    }
}