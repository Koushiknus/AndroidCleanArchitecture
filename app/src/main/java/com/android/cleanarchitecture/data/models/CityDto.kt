package com.android.cleanarchitecture.data.models

import kotlinx.serialization.Serializable

@Serializable
data class CityDto(val id: String, val name: String, val country: String)