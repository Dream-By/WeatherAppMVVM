package com.example.weatherappmvvm.ui.weather.future.list

import com.example.weatherappmvvm.data.provider.UnitProvider
import com.example.weatherappmvvm.data.repository.ForecastRepository
import com.example.weatherappmvvm.internal.lazyDeferred
import com.example.weatherappmvvm.ui.base.WeatherViewModel
import org.threeten.bp.LocalDate

class FutureListWeatherViewModel(
    private val forecastRepository: ForecastRepository,
    unitProvider: UnitProvider
) : WeatherViewModel(forecastRepository, unitProvider) {

    val weatherEntries by lazyDeferred {
        forecastRepository.getFutureWeatherList(LocalDate.now(), super.isMetricUnit)
    }
}
