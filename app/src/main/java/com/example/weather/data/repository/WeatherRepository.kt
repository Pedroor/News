package com.example.weather.data.repository

import com.example.weather.data.model.WeatherInfo

interface WeatherRepository {

    suspend fun getWeatherData(lat: Float, lng: Float): WeatherInfo
}