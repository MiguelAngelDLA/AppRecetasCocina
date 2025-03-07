package com.example.recetascocina

import RecipeDetail
import androidx.compose.material3.Scaffold
import androidx.compose.ui.graphics.Color
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun RecipeDetailScreen(
    navController: NavController,
    title: String,
    description: String,
    imageResId: Int,
    ingredients: List<String>,
    steps: List<String>
) {
    Scaffold (
        topBar = {
            CustomBar(
                title = title,
                onBackClick = { navController.popBackStack() },
                backgroundColor = Color.Blue
            )
        }
    ) { innerPadding ->
        Box(modifier = Modifier
            .fillMaxSize()
            .padding(innerPadding)
        ) {
            RecipeDetail(
                title = title,
                description = description,
                imageResId = imageResId,
                ingredients = ingredients,
                steps = steps
            )
        }
    }
}
