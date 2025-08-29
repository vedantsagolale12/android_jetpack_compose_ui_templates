package com.example.myapplication.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.components.AuthIcon
import com.example.myapplication.components.SignUpFields
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.Dimens


@Composable
fun SignUpScreen(
    onNavigateToLogin: () -> Unit,
    onNavigateToHome: () -> Unit,
    onNavigateToForgotPassword: () -> Unit
) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(AppColors.bgColor),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier = Modifier
                .padding(Dimens.PaddingSmall)
                .fillMaxWidth(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.spacedBy(Dimens.PaddingMedium)
        ) {
            Spacer(modifier = Modifier.height(10.dp))
            AuthIcon(
                iconRes = R.drawable.user,
                circleSize = 120.dp,
                borderWidth = Dimens.borderWidth,
                backgroundColor = AppColors.PrimaryColor,
                modifier = Modifier.padding(Dimens.PaddingMedium)
            )
            Spacer(modifier = Modifier.height(10.dp))
            SignUpFields(
                onNavigationToLogin = onNavigateToLogin,
                onNavigationToHome = onNavigateToHome,
                onNavigationToForgotPassword = onNavigateToForgotPassword
            )
        }
    }
}
