package com.example.recetascocina

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun ThreeDessertsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {
        RecipeVista(
            color = Color.LightGray,
            title = "Flan",
            body = "Flan con salsa de caramelo.",
            imageID = R.drawable.flan
        )
        RecipeVista(
            color = Color.LightGray,
            title = "Cheesecake",
            body = "Cheesecake cremoso y rico.",
            imageID = R.drawable.cheesecake
        )
        RecipeVista(
            color = Color.LightGray,
            title = "Brownie",
            body = "Brownie esponjoso con mucho sabor a chocolate.",
            imageID = R.drawable.brownie
        )
    }
}

@Preview(showBackground = true)
@Composable
fun ThreeDessertsPreview() {
    ThreeDessertsScreen()
}
