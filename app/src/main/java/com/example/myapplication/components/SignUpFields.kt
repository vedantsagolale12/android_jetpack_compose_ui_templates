package com.example.myapplication.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.lint.kotlin.metadata.Visibility
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.AppStrings
import com.example.myapplication.ui.theme.AppTypography
import com.example.myapplication.ui.theme.Dimens
import androidx.compose.material.icons.filled.*


@Composable
fun SignUpFields(
    onNavigationToLogin: () -> Unit,
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
            label = AppStrings.USERNAME,
            placeholder = AppStrings.USERNAME,
            keyboardType = KeyboardType.Text,
            leadingIcon = { Icon(imageVector = Icons.Default.Person, contentDescription = null) }
        )

        Spacer(modifier = Modifier.height(10.dp))

        InputFieldWithLabel(
            label = AppStrings.EMAIL,
            placeholder = AppStrings.EMAIL,
            keyboardType = KeyboardType.Email,
            leadingIcon = { Icon(imageVector = Icons.Default.Email, contentDescription = null) }
        )

        Spacer(modifier = Modifier.height(10.dp))

        PasswordInputField()

        TextButton(
            onClick = { onNavigationToForgotPassword()},
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
                text = AppStrings.SIGN_UP,
                style = AppTypography.bodyMedium,
                color = AppColors.TextColorPrimary
            )
        }

        Spacer(modifier = Modifier.height(10.dp))

        TextButton(
            onClick = { onNavigationToLogin() },
            modifier = Modifier.align(Alignment.CenterHorizontally)
        ) {
            Row(
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.Center
            ) {
                Text(
                    text = AppStrings.ALREADY_HAVE_AN_ACCOUNT,
                    style = AppTypography.bodyLarge.copy(
                        fontSize = Dimens.textSizeLarge,
                        fontWeight = FontWeight.Bold
                    ),
                    color = AppColors.PrimaryColorDark
                )
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = AppStrings.LOGIN,
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



