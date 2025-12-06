package com.android.cleanarchitecture.domain.model

import androidx.compose.runtime.Immutable

@Immutable
data class City(
    val id : String,
    val name : String,
    val country : String
)
