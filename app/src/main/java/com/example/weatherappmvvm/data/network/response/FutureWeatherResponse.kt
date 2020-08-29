package com.example.weatherappmvvm.data.network.response

import com.example.weatherappmvvm.data.db.entity.WeatherLocation
import com.google.gson.annotations.SerializedName


data class FutureWeatherResponse(
    @SerializedName("forecast")
    val futureWeatherEntries: ForecastDaysContainer,
    val location: WeatherLocation
)