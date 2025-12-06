package com.android.cleanarchitecture.domain.usecase

import com.android.cleanarchitecture.domain.model.Detail

interface GetDetailsUseCase {
    suspend operator fun invoke(cityID : String) : List<Detail>
}