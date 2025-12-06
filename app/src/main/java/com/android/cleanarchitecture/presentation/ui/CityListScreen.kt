package com.android.cleanarchitecture.presentation.ui

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.android.cleanarchitecture.domain.model.City
import com.android.cleanarchitecture.presentation.viewmodel.CityViewModel

@Composable
fun CityListScreen(navcontroller : NavController , vm : CityViewModel) {

}

@Composable
private fun CityList(cityList : List<City>,onClick :(City)  -> Unit, modifier : Modifier) {

    LazyColumn(modifier = Modifier.fillMaxSize()) {
        // Key improves scroll performance , prevents recomposition issues
        items(items = cityList, key = {city -> city.id}) { city ->
            Column(modifier = Modifier
                .clickable {
                    onClick(city) }
                .padding(16.dp)) {
                    Text(text  = city.name)
                    Text(text = city.country)
                }

        }
    }
}