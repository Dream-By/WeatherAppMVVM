package com.example.weatherappmvvm.data.network

import androidx.lifecycle.LiveData
import com.example.weatherappmvvm.data.network.response.FutureWeatherResponse
import com.example.weatherappmvvm.data.network.response.CurrentWeatherResponse


interface WeatherNetworkDataSource {
    val downloadedCurrentWeather: LiveData<CurrentWeatherResponse>
    val downloadedFutureWeather: LiveData<FutureWeatherResponse>

    suspend fun fetchCurrentWeather(
        location: String,
        languageCode: String
    )
    suspend fun fetchFutureWeather(
        location: String,
        languageCode: String
    )
}