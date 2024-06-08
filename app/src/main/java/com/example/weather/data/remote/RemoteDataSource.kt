package com.example.weather.data.remote

import WeatherDataResponse

interface RemoteDataSource {
    suspend fun getWeatherDataResponse(lat:Float, lng: Float): WeatherDataResponse
}