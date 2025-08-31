package com.example.onboardingcarouseltemplate.utils

import androidx.compose.ui.graphics.Color

object ColorConverter {

    /**
     * Convert Hex String to Compose Color
     * Example: "#FF6200EE" or "6200EE"
     */
    fun fromHex(hex: String): Color {
        val formattedHex = hex.removePrefix("#")
        // If alpha is missing, assume FF
        val colorLong = when (formattedHex.length) {
            6 -> ("FF$formattedHex").toLong(16)
            8 -> formattedHex.toLong(16)
            else -> throw IllegalArgumentException("Invalid hex color: $hex")
        }
        return Color(colorLong)
    }

    /**
     * Convert RGB to Compose Color
     * Each value should be 0..255
     */
    fun fromRGB(red: Int, green: Int, blue: Int): Color {
        return Color(red, green, blue)
    }

    /**
     * Convert ARGB to Compose Color
     * Each value should be 0..255
     */
    fun fromARGB(alpha: Int, red: Int, green: Int, blue: Int): Color {
        return Color(red, green, blue, alpha)
    }

    /**
     * Convert integer color (0xAARRGGBB) to Compose Color
     */
    fun fromInt(colorInt: Int): Color {
        return Color(colorInt)
    }
}
