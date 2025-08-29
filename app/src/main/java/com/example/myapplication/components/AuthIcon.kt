package com.example.myapplication.components

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import com.example.myapplication.R
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.Dimens

import androidx.annotation.DrawableRes
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Icon

import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color

@Composable
fun AuthIcon(
    @DrawableRes iconRes: Int,
    modifier: Modifier = Modifier,
    circleSize: Dp = 80.dp,
    borderWidth: Dp = 2.dp,
    borderColor: Color = AppColors.TextColorPrimary,
    backgroundColor: Color = Color.Transparent,
    iconSize: Dp = circleSize * 0.5f
) {
    Surface(
        modifier = modifier.size(circleSize),
        shape = CircleShape,
        color = backgroundColor,
        border = BorderStroke(borderWidth, borderColor)
    ) {
        Box(
            modifier = Modifier
                .fillMaxSize(),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(id = iconRes),
                contentDescription = null,
                tint = AppColors.AccentColor,
                modifier = Modifier.size(iconSize)
            )
        }
    }
}