package com.example.weatherappmvvm.data.network.response

import com.google.gson.annotations.SerializedName
import com.example.weatherappmvvm.data.db.entity.CurrentWeatherEntry
import com.example.weatherappmvvm.data.db.entity.WeatherLocation

data class CurrentWeatherResponse(
    val location: WeatherLocation,
    @SerializedName("current")
    val currentWeatherEntry: CurrentWeatherEntry
)