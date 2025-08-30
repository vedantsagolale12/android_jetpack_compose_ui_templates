package com.example.myapplication.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable

@Composable
fun ProfileCardTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = lightColorScheme(
            primary = GradientStart,
            secondary = GradientEnd,
            background = White,
            onBackground = Black
        ),
        typography = AppTypography,
        content = content
    )
}