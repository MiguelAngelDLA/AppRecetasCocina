package com.example.recetascocina

import RecipeDetail
import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "threeDesserts") {
        composable("threeDesserts") {
            ThreeDessertsScreen(navController)
        }
        composable(
            route = "recipeDetail/{recipeId}",
            arguments = listOf(navArgument("recipeId") { type = NavType.IntType })
        ) { backStackEntry ->
            val recipeId = backStackEntry.arguments?.getInt("recipeId") ?: 0

            when (recipeId) {
                1 -> RecipeDetail(
                    title = "Flan de vainilla",
                    description = "Flan de vainilla cremoso.",
                    imageResId = R.drawable.flan,
                    ingredients = listOf("Leche", "Huevos", "Azucar", "Extracto de vainilla"),
                    steps = listOf(
                        "Precaliente el horno a 175 grados Celsius",
                        "Mezcle los ingredientes.",
                        "Ponga la mezcla en un molde para hornear.",
                        "Hornee a baño maría por 45 minutos",
                        "Enfrie antes de servir",
                        "¡Vualá!"
                    )
                )
                2 -> RecipeDetail(
                    title = "Cheesecake clásico",
                    description = "Un cheesecake cremoso con una base de galleta.",
                    imageResId = R.drawable.cheesecake,
                    ingredients = listOf("Queso crema", "Galletas", "Mantequilla", "Azucar", "Huevos", "Extracto de vainilla"),
                    steps = listOf(
                        "Triture las galletas y mézclelas con mantequilla derretida.",
                        "Presione la mezcla en el fondo de un molde.",
                        "Mezcle el queso crema, azucar, huevos y extracto de vainilla.",
                        "Vierta la mezcla sobre la base de galletas.",
                        "Hornee a 160 grados Celsius por 50 minutos.",
                        "Deje enfriar y refrigere por al menos 4 horas."
                    )
                )
                3 -> RecipeDetail(
                    title = "Brownie de chocolate",
                    description = "Brownie esponjoso con mucho sabor a chocolate.",
                    imageResId = R.drawable.brownie,
                    ingredients = listOf("Chocolate", "Mantequilla", "Azúcar", "Huevos", "Harina", "Nueces (opcional)"),
                    steps = listOf(
                        "Precaliente el horno a 180 grados Celsius.",
                        "Derrita el chocolate y la mantequilla juntos.",
                        "Mezcle el azúcar y los huevos en un tazón.",
                        "Incorpore la mezcla de chocolate a los huevos.",
                        "Agregue la harina y las nueces.",
                        "Vierta la mezcla en un molde y hornee por 25-30 minutos."
                    )
                )
                else -> RecipeDetail(
                    title = "Receta Desconocida",
                    description = "No se han encontrado detalles para esta receta.",
                    imageResId = R.drawable.shrek,
                    ingredients = emptyList(),
                    steps = emptyList()
                )
            }
        }
    }
}
