package com.example.weather.data.local

import android.content.Context
import android.content.Context.MODE_PRIVATE
import android.content.SharedPreferences

class WeatherSharedPreferences {
    private lateinit var preferences: SharedPreferences

    var clothesId: Int
        set(value) {
            preferences.edit().putInt(CLOTHES_ID, value).apply()
        }
        get() = preferences.getInt(CLOTHES_ID, -1)

    var day: String?
        set(value) {
            preferences.edit().putString(DAY, value).apply()
        }
        get() = preferences.getString(DAY, null)

    fun initPreferences(context: Context) {
        preferences = context.getSharedPreferences(CLOTHES_ID, MODE_PRIVATE)
    }

    companion object{
        const val CLOTHES_ID = "clothesId"
        const val DAY = "day"
    }
}