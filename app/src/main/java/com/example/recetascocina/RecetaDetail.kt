import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.recetascocina.R

@Composable
fun RecipeDetail(
    title: String,
    description: String,
    imageResId: Int,
    ingredients: List<String>,
    steps: List<String>
) {
    // Make the layout scrollable in case of overflow
    Column(
        modifier = Modifier
            .fillMaxSize()
            .verticalScroll(rememberScrollState())
            .padding(16.dp)
    ) {
        // Recipe image
        Image(
            painter = painterResource(id = imageResId),
            contentDescription = "$title image",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp)
                .clip(RoundedCornerShape(10.dp))
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )

        Text(
            text = description,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        Text(
            text = "Ingredientes",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        ingredients.forEach { ingredient ->
            Text(
                text = "• $ingredient",
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }

        Spacer(modifier = Modifier.height(16.dp))

        Text(
            text = "Pasos",
            fontSize = 20.sp,
            modifier = Modifier.padding(bottom = 8.dp)
        )
        steps.forEachIndexed { index, step ->
            Text(
                text = "${index + 1}. $step",
                modifier = Modifier.padding(bottom = 4.dp)
            )
        }
    }
}



@Preview(showBackground = true)
@Composable
fun RecipeDetailPreview() {
    RecipeDetail(
        title = "Flan de vainilla",
        description = "Flan de vainilla cremoso.",
        imageResId = R.drawable.flan,
        ingredients = listOf("Leche", "Huevos", "Azucar", "Extracto de vainilla"),
        steps = listOf(
            "Precaliente el horno a 175 grados Celsius",
            "Mezcle los ingredientes.",
            "Ponga la mezcla en un molde para hornear.",
            "Hornee a baño maría por 45 minutos.",
            "Enfrie antes de servir.",
            "Vualá!"
        )
    )
}
