package com.android.cleanarchitecture.presentation.viewmodel

import androidx.lifecycle.ViewModel
import com.android.cleanarchitecture.domain.model.City
import com.android.cleanarchitecture.domain.model.Detail
import com.android.cleanarchitecture.presentation.state.UiState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class CityViewModel() : ViewModel() {

    //Cities List (Stateflow)
    private val _citiesSate = MutableStateFlow<UiState<List<City>>>(UiState.Loading)
    val citiesState = _citiesSate.asStateFlow()

    //Selected City (Stateflow)
    private val _selectedCity = MutableStateFlow<City?>(null)
    val selectedCity = _selectedCity.asStateFlow()

    //Details List (Stateflow)
    private val _detailsState = MutableStateFlow<UiState<List<Detail>>>(UiState.Loading)
    val detailState = _detailsState.asStateFlow()



}