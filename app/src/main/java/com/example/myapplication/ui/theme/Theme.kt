package com.example.myapplication.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.ColorScheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext

private val LightColors = lightColorScheme(
    primary = AppColors.PrimaryColor,
    secondary = AppColors.SecondaryColor,
    tertiary = AppColors.AccentColor,
    onPrimary = AppColors.TextColorPrimary,
    onBackground = AppColors.bgColor,
    onError = AppColors.ErrorColor
)

private val DarkColors = darkColorScheme(
    primary = AppColors.PrimaryColorDark,
    secondary = AppColors.SecondaryColorDark,
    tertiary = AppColors.AccentColorDark,
    onPrimary = AppColors.TextColorPrimaryDark,
    onBackground = AppColors.PrimaryColorDark,
    onError = AppColors.onErrorDark
)

@Composable
fun AppTheme(content:@Composable ()->Unit){
    MaterialTheme(
        colorScheme=LightColors,
        typography=AppTypography,
        content=content
    )
}