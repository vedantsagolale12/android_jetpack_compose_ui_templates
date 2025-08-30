package com.example.myapplication.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.components.CustomButton
import com.example.myapplication.components.CustomButtonImageType
import com.example.myapplication.components.PillChipsComponent
import com.example.myapplication.components.ProfileContent
import com.example.myapplication.components.ProfileImageWithStatus
import com.example.myapplication.components.StatsSectionComponent
import com.example.myapplication.components.StatsSectionComponentImageType
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.Dimens

@Composable
@Preview(showBackground = true, showSystemUi = true, device = Devices.DEFAULT)
fun CardAsBackgroundStyleScreen() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(500.dp)
            .padding(Dimens.MediumPadding),

    ) {
        Card(
            modifier = Modifier.fillMaxSize(),
            shape = RoundedCornerShape(20.dp),
            elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
        ) {
            Image(
                painter = painterResource(R.drawable.card_bg),
                contentDescription = null,
                contentScale = ContentScale.Crop,
                modifier = Modifier.fillMaxSize()
            )
        }


        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = Dimens.MediumPadding)
        ) {
            // Add space to push profile image to middle-left area
            Spacer(modifier = Modifier.height(80.dp))

            // Profile Image positioned at left-middle
            Box(
                modifier = Modifier.fillMaxWidth(),
                contentAlignment = Alignment.CenterStart
            ) {
                ProfileImageWithStatus()
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Profile Content
            ProfileContent(
                name = "Vedant Sagolale",
                designation = "Android Developer",
                color = AppColors.White
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Skills/Tags
            PillChipsComponent(
                items = listOf("Android", "Flutter", "iOS"),
                modifier = Modifier.fillMaxWidth(),
                bgColor = AppColors.Black,
                txtColor = AppColors.White
            )

            Spacer(modifier = Modifier.height(12.dp))

            // Stats Section
            StatsSectionComponentImageType(
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(10.dp))

            // Contact Button
            CustomButtonImageType(
                label = "Get In Touch",
                modifier = Modifier.fillMaxWidth()
            )

            Spacer(modifier = Modifier.height(2.dp))
        }
    }
}