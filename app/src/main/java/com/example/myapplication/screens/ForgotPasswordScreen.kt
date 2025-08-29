package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.components.AuthIcon
import com.example.myapplication.components.InputFieldWithLabel
import com.example.myapplication.ui.theme.*

@Composable
@Preview(showBackground = true, showSystemUi = true)
fun ForgotPasswordScreen(onNavigationToLogin: () -> Unit = {}) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.bgColor)
            .padding(Dimens.PaddingMedium),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Top
    ) {
        Spacer(modifier = Modifier.height(32.dp))
        AuthIcon(
            iconRes = R.drawable.user,
            circleSize = 120.dp,
            borderWidth = Dimens.borderWidth,
            backgroundColor = AppColors.PrimaryColor,
            modifier = Modifier.padding(Dimens.PaddingMedium)
        )
        Spacer(modifier = Modifier.height(12.dp))
        Text(
            text = AppStrings.FORGOT_PASSWORD,
            style = AppTypography.headlineMedium.copy(
                fontWeight = FontWeight.Bold
            ),
            color = AppColors.AccentColor
        )
        Spacer(modifier = Modifier.height(20.dp))
        Text(
            text = AppStrings.FORGOT_PASSWORD_DESC,
            style = AppTypography.bodyMedium,
            color = AppColors.AccentColorDark,
            modifier = Modifier.padding(Dimens.PaddingMedium)
        )
        Spacer(modifier = Modifier.height(24.dp))
        ForgotPasswordContent()
        Spacer(modifier = Modifier.height(20.dp))
        TextButton(
            onClick = { onNavigationToLogin() },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Text(
                text = AppStrings.BACK_TO_LOGIN,
                style = AppTypography.bodyMedium.copy(
                    fontSize = Dimens.textSizeMedium,
                    fontWeight = FontWeight.Bold
                ),
                color = AppColors.AccentColor
            )
        }
    }
}

@Composable
fun ForgotPasswordContent() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = Dimens.PaddingMedium),
        horizontalAlignment = Alignment.Start
    ) {
        InputFieldWithLabel(
            label = AppStrings.EMAIL,
            placeholder = AppStrings.EMAIL,
            keyboardType = KeyboardType.Email,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) }
        )

        Spacer(modifier = Modifier.height(20.dp))

        ElevatedButton(
            onClick = { /* TODO */ },
            modifier = Modifier
                .fillMaxWidth()
                .padding(Dimens.PaddingSmall),
            colors = ButtonDefaults.buttonColors(
                containerColor = AppColors.AccentColor,
                contentColor = AppColors.TextColorPrimary
            ),
            shape = RoundedCornerShape(Dimens.CornerRadiusMedium)
        ) {
            Text(
                text = AppStrings.SEND,
                style = AppTypography.bodyMedium.copy(
                    fontSize = Dimens.textSizeMedium,
                    fontWeight = FontWeight.Bold
                ),
                color = AppColors.TextColorPrimary
            )
        }
    }
}
