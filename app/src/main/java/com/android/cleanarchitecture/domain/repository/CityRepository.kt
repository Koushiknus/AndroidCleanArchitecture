package com.android.cleanarchitecture.domain.repository

import com.android.cleanarchitecture.domain.model.City
import com.android.cleanarchitecture.domain.model.Detail

interface CityRepository {
    suspend fun getCities(): List<City>
    suspend fun getDetailsForCity(cityId: String): List<Detail>
}