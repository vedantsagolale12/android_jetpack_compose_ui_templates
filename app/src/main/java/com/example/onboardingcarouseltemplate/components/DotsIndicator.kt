package com.example.onboardingcarouseltemplate.components

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun DotsIndicator(
    totalDots: Int,
    selectedIndex: Int,
    selectedColor: Color = Color.Black,
    unSelectedColor: Color = Color.LightGray
) {
    Row(
        modifier = Modifier
            .wrapContentWidth()
            .wrapContentHeight(),
        horizontalArrangement = Arrangement.Center
    ) {
        for (i in 0 until totalDots) {
            Box(
                modifier = Modifier
                    .padding(4.dp)
                    .size(if (i == selectedIndex) 12.dp else 8.dp)
                    .background(
                        color = if (i == selectedIndex) selectedColor else unSelectedColor,
                        shape = CircleShape
                    )
            )
        }
    }
}
