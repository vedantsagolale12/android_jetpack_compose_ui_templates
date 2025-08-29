package com.example.myapplication.utils

import androidx.compose.ui.graphics.Color
import androidx.core.graphics.toColorInt

fun Color(hex: String): Color {
    return Color(hex.toColorInt())
}