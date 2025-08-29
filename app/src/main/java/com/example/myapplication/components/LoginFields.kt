package com.example.myapplication.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.AppStrings
import com.example.myapplication.ui.theme.AppTypography
import com.example.myapplication.ui.theme.Dimens

@Composable
fun LoginFields(
    onNavigationToSignUp: () -> Unit,
    onNavigationToHome: () -> Unit,
    onNavigationToForgotPassword: () -> Unit
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = Dimens.PaddingMedium), // better spacing
        horizontalAlignment = Alignment.Start
    ) {
        InputFieldWithLabel(
            label = AppStrings.EMAIL,
            placeholder = AppStrings.EMAIL,
            keyboardType = KeyboardType.Email,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) }
        )
        Spacer(modifier = Modifier.height(10.dp))

        // 🔹 Password Field
        PasswordInputField()
        TextButton(
            onClick = { onNavigationToForgotPassword() },
            modifier = Modifier.align(Alignment.End)
        ) {
            Text(
                text = AppStrings.FORGOT_PASSWORD,
                style = AppTypography.bodyLarge.copy(
                    fontSize = Dimens.textSizeMedium,
                    fontWeight = FontWeight.Bold
                ),
                color = AppColors.PrimaryColorDark,
                textAlign = TextAlign.End
            )
        }

        Spacer(modifier = Modifier.height(30.dp))

        // 🔹 Sign Up Button
        ElevatedButton(
            onClick = { onNavigationToHome() },
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
                text = AppStrings.LOGIN,
                style = AppTypography.bodyMedium,
                color = AppColors.TextColorPrimary
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        // 🔹 Already Have Account? Login
        TextButton(
            onClick = { onNavigationToSignUp() },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = AppStrings.DONT_HAVE_AN_ACCOUNT,
                    style = AppTypography.bodyLarge.copy(
                        fontSize = Dimens.textSizeLarge,
                        fontWeight = FontWeight.Bold
                    ),
                    color = AppColors.PrimaryColorDark
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = AppStrings.SIGN_UP,
                    style = AppTypography.bodyLarge.copy(
                        fontSize = Dimens.textSizeLarge,
                        fontWeight = FontWeight.ExtraBold
                    ),
                    color = AppColors.SecondaryColor
                )
            }
        }
    }
}