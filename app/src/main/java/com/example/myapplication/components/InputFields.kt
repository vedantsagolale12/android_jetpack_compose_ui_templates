package com.example.myapplication.components

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material.icons.rounded.Lock
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.AppStrings
import com.example.myapplication.ui.theme.AppTypography
import com.example.myapplication.ui.theme.Dimens

@Composable
fun InputFieldWithLabel(
    label: String,
    placeholder: String,
    keyboardType: KeyboardType = KeyboardType.Text,
    leadingIcon: @Composable (() -> Unit)? = null
) {
    var text by remember { mutableStateOf("") }

    Text(
        text = label,
        style = AppTypography.labelLarge,
        color = AppColors.AccentColorDark,
        modifier = Modifier.padding(
            start = Dimens.PaddingSmall,
            bottom = Dimens.PaddingSmall / 2
        )
    )

    OutlinedTextField(
        value = text,
        onValueChange = {newText -> text = newText },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = Dimens.PaddingSmall),
        textStyle = AppTypography.bodyMedium,
        shape = RoundedCornerShape(Dimens.CornerRadiusLarge),
        leadingIcon = leadingIcon,
        placeholder = {
            Text(
                text = placeholder,
                style = AppTypography.bodyMedium,
                color = AppColors.AccentColor
            )
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = AppColors.TextColorPrimary,
            unfocusedContainerColor = AppColors.TextColorPrimary,
            focusedTextColor = AppColors.AccentColorDark,
            unfocusedTextColor = AppColors.AccentColor,
            focusedIndicatorColor = AppColors.AccentColor,
            unfocusedIndicatorColor = AppColors.AccentColor.copy(alpha = 0.5f)
        )
    )
}

@Composable
fun PasswordInputField(
    label: String = AppStrings.PASSWORD,
    placeholder: String = AppStrings.PASSWORD
) {
    var password by remember { mutableStateOf("") }
    var isPasswordVisible by remember { mutableStateOf(false) }

    Text(
        text = label,
        style = AppTypography.labelLarge,
        color = AppColors.AccentColorDark,
        modifier = Modifier.padding(
            start = Dimens.PaddingSmall,
            bottom = Dimens.PaddingSmall / 2
        )
    )

    OutlinedTextField(
        value = password,
        onValueChange = { password = it },
        modifier = Modifier
            .fillMaxWidth()
            .padding(bottom = Dimens.PaddingSmall),
        textStyle = AppTypography.bodyMedium,
        shape = RoundedCornerShape(Dimens.CornerRadiusLarge),
        leadingIcon = {
            Icon(imageVector = Icons.Rounded.Lock, contentDescription = null)
        },
        placeholder = {
            Text(
                text = placeholder,
                style = AppTypography.bodyMedium,
                color = AppColors.AccentColor
            )
        },
        trailingIcon = {
            val visibilityIcon = if (isPasswordVisible) {
                Icons.Default.Visibility
            } else {
                Icons.Default.VisibilityOff
            }
            IconButton(onClick = { isPasswordVisible = !isPasswordVisible }) {
                Icon(
                    imageVector = visibilityIcon,
                    contentDescription = if (isPasswordVisible) "Hide password" else "Show password"
                )
            }
        },
        visualTransformation = if (isPasswordVisible) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        colors = TextFieldDefaults.colors(
            focusedContainerColor = AppColors.TextColorPrimary,
            unfocusedContainerColor = AppColors.TextColorPrimary,
            focusedTextColor = AppColors.AccentColorDark,
            unfocusedTextColor = AppColors.AccentColor,
            focusedIndicatorColor = AppColors.AccentColor,
            unfocusedIndicatorColor = AppColors.AccentColor.copy(alpha = 0.5f)
        )
    )
}