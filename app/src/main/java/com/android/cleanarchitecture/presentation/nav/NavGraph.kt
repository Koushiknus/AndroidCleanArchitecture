package com.android.cleanarchitecture.presentation.nav

import androidx.compose.runtime.Composable
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.android.cleanarchitecture.presentation.ui.CityDetailScreen
import com.android.cleanarchitecture.presentation.ui.CityListScreen
import com.android.cleanarchitecture.presentation.viewmodel.CityViewModel

@Composable
fun NavGraph() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "list") {
        composable("list") {
            val vm: CityViewModel = hiltViewModel()
            CityListScreen(navcontroller = navController, vm = vm)
        }
        composable(
            route = "details/{cityId}",
            arguments = listOf(navArgument("cityID") {
                type = NavType.StringType
            })
        ) { backStackEntry ->
            val viewmodel: CityViewModel = hiltViewModel()
            CityDetailScreen(
                navController = navController,
                cityId = backStackEntry.arguments?.getString("cityId") ?: "",
                viewmodel
            )
        }
    }
}