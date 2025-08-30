package com.example.myapplication.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AppTypography
import com.example.myapplication.ui.theme.Inter

@Composable
fun PillChipsComponent(
    items: List<String>,
    modifier: Modifier = Modifier,
    bgColor: Color = Color.Black.copy(alpha = 0.6f), // default values
    txtColor: Color = Color.White
) {
    Row(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(12.dp),
        verticalAlignment = Alignment.CenterVertically
    ) {
        items.forEach { label ->
            PillChip(
                label = label,
                bgColor = bgColor,
                txtColor = txtColor
            )
        }
    }
}

@Composable
fun PillChip(
    label: String,
    bgColor: Color,
    txtColor: Color
) {
    val isSpecial = label.startsWith("+")

    Surface(
        modifier = Modifier.clip(CircleShape),
        color = if (isSpecial) Color.Transparent else bgColor,
        shape = CircleShape,
        tonalElevation = 0.dp,
        shadowElevation = 0.dp
    ) {
        Box(
            modifier = Modifier
                .border(
                    width = 1.dp,
                    color = Color(0xFFE0E0E0),
                    shape = CircleShape
                )
                .padding(horizontal = 16.dp, vertical = 8.dp),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = label,
                style = AppTypography.bodyMedium.copy(
                    fontFamily = Inter,
                    fontWeight = FontWeight.Bold
                ),
                color = if (isSpecial) bgColor else txtColor
            )
        }
    }
}
