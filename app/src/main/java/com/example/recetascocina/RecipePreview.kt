package com.example.recetascocina

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer

@Preview
@Composable
fun RecipePreview(){
    RecipeVista(Color.LightGray, "Flan casero", "El flan (del francés flan)1\u200B es un postre de origen francés 2\u200B elaborado con una natilla teniendo como ingredientes principales yemas de huevos, un poco de clara a veces, leche entera y azúcar que luego es refrigerado para obtener una textura cremosa y gelatinosa.\n"
            , R.drawable.flan)
}

@Composable
fun RecipeVista(
    color: Color,
    title: String,
    body: String,
    imageID: Int
) {
    Box(
        modifier = Modifier
            .height(160.dp)
            .width(700.dp)
            .background(color)
    ) {
        Box(
            modifier = Modifier
                .height(100.dp)
                .width(100.dp)
                .align(Alignment.TopStart)
                .padding(5.dp)
        ) {
            Image(
                painter = painterResource(imageID),
                contentDescription = "Round corner image",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(128.dp)
                    .clip(RoundedCornerShape(10))
                    .border(5.dp, Color.Gray, RoundedCornerShape(10))
            )
        }

        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(start = 110.dp)
        ) {
            Text(
                text = title,
                fontSize = 20.sp,
                color = Color.Black
            )
            Spacer(modifier = Modifier.height(4.dp))
            Text(
                text = body,
                fontSize = 16.sp,
                color = Color.DarkGray
            )
        }
    }
}
