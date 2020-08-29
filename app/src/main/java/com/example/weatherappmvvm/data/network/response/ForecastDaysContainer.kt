package com.example.weatherappmvvm.data.network.response

import com.example.weatherappmvvm.db.entity.FutureWeatherEntry
import com.google.gson.annotations.SerializedName


data class ForecastDaysContainer(
    @SerializedName("forecastday")
    val entries: List<FutureWeatherEntry>
)