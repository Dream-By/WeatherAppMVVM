package com.example.weatherappmvvm.ui.weather.current

import androidx.lifecycle.ViewModel;
import com.example.weatherappmvvm.data.provider.UnitProvider
import com.example.weatherappmvvm.data.repository.ForecastRepository
import com.example.weatherappmvvm.internal.lazyDeferred
import com.example.weatherappmvvm.ui.base.WeatherViewModel


class CurrentWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weather by lazyDeferred {
        forecastRepository.getCurrentWeather(super.isMetricUnit)
    }
}
