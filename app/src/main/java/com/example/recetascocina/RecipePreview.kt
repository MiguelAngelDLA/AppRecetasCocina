package com.example.recetascocina

import android.media.Image
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.FlowRowScopeInstance.align
import androidx.compose.foundation.layout.Spacer
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

@Preview
@Composable
fun RecipePreview(){
    RecipeVista(Color.LightGray, "Holalalalalalala", R.drawable.flan)
}


@Composable
fun RecipeVista(color: Color, previewText: String, imageID: Int){
    Box(
        modifier = Modifier.height(160.dp)
            .width(700.dp)
            .background(color)
    )
    {
        Box(modifier = Modifier.height(100.dp).width(100.dp).align(alignment = Alignment.TopStart).padding(5.dp)){
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
        Box(
            modifier = Modifier.height(160.dp).width(160.dp).align(Alignment.Center)
        ){
            Text(previewText)
        }

    }
}