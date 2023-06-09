package com.example.weather.data.util

sealed class Status<out T> {
    object Loading : Status<Nothing>()
    data class Fail(val message: String) : Status<Nothing>()
    data class Success<T>(val data: T) : Status<T>()
}