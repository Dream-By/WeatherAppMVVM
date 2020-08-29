package com.example.weatherappmvvm.ui.base

import androidx.lifecycle.ViewModel
import com.example.weatherappmvvm.data.provider.UnitProvider
import com.example.weatherappmvvm.data.repository.ForecastRepository
import com.example.weatherappmvvm.internal.UnitSystem
import com.example.weatherappmvvm.internal.lazyDeferred


abstract class WeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : ViewModel() {

    private val unitSystem = unitProvider.getUnitSystem()

    val isMetricUnit: Boolean
        get() = unitSystem == UnitSystem.METRIC

    val weatherLocation by lazyDeferred {
        forecastRepository.getWeatherLocation()
    }
}