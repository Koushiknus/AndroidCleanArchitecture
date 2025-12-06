package com.android.cleanarchitecture.presentation.ui

import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.navigation.NavController
import com.android.cleanarchitecture.presentation.viewmodel.CityViewModel

@Composable
fun CityDetailScreen(navController: NavController, cityId : String, cityViewModel : CityViewModel) {

    LaunchedEffect(cityId) {
        cityViewModel.lo
    }
}