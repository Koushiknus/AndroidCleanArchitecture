package com.android.cleanarchitecture.data.impl

import com.android.cleanarchitecture.domain.model.Detail
import com.android.cleanarchitecture.domain.repository.CityRepository
import com.android.cleanarchitecture.domain.usecase.GetDetailsUseCase

class GetDetailsUseCaseImpl(
    private val repo : CityRepository
) : GetDetailsUseCase {
    override suspend fun invoke(cityID: String): List<Detail> {
       return  repo.getDetailsForCity(cityID)
    }
}