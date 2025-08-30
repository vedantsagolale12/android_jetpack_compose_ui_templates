package com.example.myapplication.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Star
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.VerticalDivider
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.AppTypography
import com.example.myapplication.ui.theme.Dimens

@Composable
fun StatsSectionComponent(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        RatingSection(
            imageVector = Icons.Default.Star,
            headerContent = "4.9",
            labelContent = "Rating",
            color = AppColors.Black
        )

        DividerItem()
        RatingSection(
            painter = painterResource(id = R.drawable.medal_ribbon),
            headerContent = "50+",
            labelContent = "Clients",
            color = AppColors.Black
        )
        DividerItem()
        RatingSection(
            painter = painterResource(id = R.drawable.rupee),
            headerContent = "1000/hr",
            labelContent = "Rate",
            color = AppColors.Black
        )
    }
}

@Composable
fun StatsSectionComponentImageType(modifier: Modifier = Modifier) {
    Row(
        modifier = modifier.padding(horizontal = 16.dp, vertical = 8.dp),
        horizontalArrangement = Arrangement.SpaceEvenly,
        verticalAlignment = Alignment.CenterVertically
    ) {
        RatingSection(
            imageVector = Icons.Default.Star,
            headerContent = "4.9",
            labelContent = "Rating",
            color = AppColors.White
        )

        DividerItem()
        RatingSection(
            painter = painterResource(id = R.drawable.medal_ribbon),
            headerContent = "50+",
            labelContent = "Clients",
            color = AppColors.White
        )
        DividerItem()
        RatingSection(
            painter = painterResource(id = R.drawable.rupee),
            headerContent = "1000/hr",
            labelContent = "Rate",
            color = AppColors.White
        )
    }
}


@Composable
private fun DividerItem() {
    VerticalDivider(
        modifier = Modifier
            .padding(horizontal = 8.dp)
            .height(40.dp),
        color = AppColors.Gray.copy(alpha = 0.4f)
    )
}


@Composable
fun RatingSection(
    imageVector: ImageVector,
    headerContent: String,
    labelContent: String,
    color: Color
) {
    BaseRatingSection(
        icon = {
            Icon(
                imageVector = imageVector,
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(Dimens.iconSize)
            )
        },
        headerContent = headerContent,
        labelContent = labelContent,
        color = color
    )
}

@Composable
fun RatingSection(
    painter: Painter,
    headerContent: String,
    labelContent: String,
    color: Color
) {
    BaseRatingSection(
        icon = {
            Icon(
                painter = painter,
                contentDescription = null,
                tint = color,
                modifier = Modifier.size(Dimens.iconSize)
            )
        },
        headerContent = headerContent,
        labelContent = labelContent,
        color=color
    )
}


@Composable
private fun BaseRatingSection(
    icon: @Composable () -> Unit,
    headerContent: String,
    labelContent: String,
    color: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            icon()
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = headerContent,
                style = AppTypography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                color = color
            )
        }
        Text(
            text = labelContent,
            style = AppTypography.labelSmall,
            color = color
        )
    }
}

@Composable
private fun BaseRatingSectionImageType(
    icon: @Composable () -> Unit,
    headerContent: String,
    labelContent: String,
    color: Color
) {
    Column(horizontalAlignment = Alignment.CenterHorizontally) {
        Row(verticalAlignment = Alignment.CenterVertically) {
            icon()
            Spacer(modifier = Modifier.width(4.dp))
            Text(
                text = headerContent,
                style = AppTypography.bodyMedium.copy(fontWeight = FontWeight.Bold),
                color = color
            )
        }
        Spacer(modifier = Modifier.width(5.dp))
        Text(
            text = labelContent,
            style = AppTypography.bodySmall,
            color = color
        )
    }
}
