package com.example.myapplication.components

import android.graphics.Color
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.AppTypography
import com.example.myapplication.ui.theme.Dimens
import com.example.myapplication.ui.theme.OpenSans

@Composable
fun CustomButton(
    label: String, modifier: Modifier,

) {
    ElevatedButton(
        onClick = {},
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppColors.Black,
            contentColor = AppColors.White
        )
    ) {
        Text(
            text = "Get In Touch",
            style = AppTypography.titleMedium.copy(
                fontSize = 20.sp,
                fontFamily = OpenSans

            )
        )
    }
}


@Composable
fun CustomButtonImageType(
    label: String, modifier: Modifier,
    ) {
    ElevatedButton(
        onClick = {},
        shape = RoundedCornerShape(25.dp),
        modifier = Modifier
            .fillMaxWidth()
            .height(50.dp),
        colors = ButtonDefaults.buttonColors(
            containerColor = AppColors.White,
            contentColor = AppColors.Black
        )
    ) {
        Text(
            text = "Get In Touch",
            style = AppTypography.titleMedium.copy(
                fontSize = 20.sp,
                fontFamily = OpenSans,
                fontWeight = FontWeight.SemiBold

            )
        )
    }
}