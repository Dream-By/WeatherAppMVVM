package com.example.weatherappmvvm.data.provider

import com.example.weatherappmvvm.internal.UnitSystem

interface UnitProvider {
    fun getUnitSystem(): UnitSystem
}