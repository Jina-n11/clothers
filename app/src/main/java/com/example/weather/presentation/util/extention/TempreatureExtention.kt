package com.example.weather.presentation.util.extention

fun Double.toCelsius () : Double {
    return String.format("%.2f", (this - 273.15)).toDouble()
}

fun Double.toPercent () : String {
    return String.format("%.2f", (this/100)).toDouble().toString()
}