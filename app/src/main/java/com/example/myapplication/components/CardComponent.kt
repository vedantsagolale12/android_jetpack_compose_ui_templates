package com.example.myapplication.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Devices
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.myapplication.R
import com.example.myapplication.ui.theme.AppColors
import com.example.myapplication.ui.theme.AppTypography
import com.example.myapplication.ui.theme.Dimens
import com.example.myapplication.ui.theme.Inter
import com.example.myapplication.ui.theme.Montserrat
import com.example.myapplication.ui.theme.OpenSans

@Composable
@Preview(showBackground = true, showSystemUi = true, device = Devices.DEFAULT)
fun CardComponent() {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .padding(Dimens.MediumPadding),
        shape = RoundedCornerShape(20.dp),
        colors = CardDefaults.cardColors(containerColor = AppColors.White),
        elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
    ) {
        Column {
            AbstractImage()
            ProfileSection()
        }
    }
}

@Composable
fun AbstractImage() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(140.dp),
    ) {
        Image(
            painter = painterResource(id = R.drawable.card_bg),
            contentDescription = "Card background",
            modifier = Modifier
                .fillMaxSize()
                .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
            contentScale = ContentScale.Crop
        )
    }
}

@Composable
fun ProfileSection() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .offset(y = (-Dimens.ProfileImageSize * 0.55f))
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Dimens.MediumPadding)
        ) {
            ProfileImageWithStatus()
        }
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(horizontal = Dimens.MediumPadding)
        ) {
            Spacer(modifier = Modifier.height(6.dp))

            ProfileContent(
                name = "Vedant Sagolale",
                designation = "Android Developer",
                color = AppColors.Black
            )
            Spacer(modifier = Modifier.height(10.dp))
            PillChipsComponent(
                items = listOf("Android", "Flutter", "iOS"),
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(12.dp))
            StatsSectionComponent(
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(10.dp))
            CustomButton(
                "Get In Touch",
                modifier = Modifier.fillMaxWidth()
            )
            Spacer(modifier = Modifier.height(2.dp))
        }
    }
}

@Composable
fun ProfileImageWithStatus() {
    Box(
        modifier = Modifier.size(Dimens.ProfileImageSize),
        contentAlignment = Alignment.BottomEnd
    ) {
        Image(
            painter = painterResource(id = R.drawable.pic),
            contentDescription = "User profile picture",
            modifier = Modifier
                .fillMaxSize()
                .shadow(
                    elevation = 8.dp,
                    shape = CircleShape,
                    clip = false
                )
                .clip(CircleShape)
        )

        OnlineStatusDot()
    }
}

@Composable
fun OnlineStatusDot() {
    val dotSize = Dimens.ProfileImageSize * 0.20f
    val insetOffset = dotSize * 0.35f
    Box(
        modifier = Modifier
            .size(dotSize)
            .offset(x = -insetOffset, y = -insetOffset)
            .shadow(
                elevation = 6.dp,
                shape = CircleShape,
                clip = false
            )
            .clip(CircleShape)
            .border(2.dp, AppColors.White, CircleShape)
            .background(AppColors.GreenOnline)
    )
}

@Composable
fun ProfileContent(name: String, designation: String,color: Color) {
    Row(
        modifier = Modifier.fillMaxWidth(),
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(
                text = name,
                style = AppTypography.titleLarge.copy(
                    fontWeight = FontWeight.Bold
                ),
                color =  color
            )

            Spacer(modifier = Modifier.height(2.dp))

                    Text(
                        text = designation,
                        style = AppTypography.bodyMedium.copy(
                            fontWeight = FontWeight.Normal,

                            ),
                        color = color
                    )
        }


        Box(
            modifier = Modifier
                .size(44.dp)
                .shadow(
                    elevation = 2.dp,
                    shape = CircleShape,
                    clip = false
                )
                .clip(CircleShape)
                .background(AppColors.White)
                .border(
                    1.dp,
                    AppColors.Gray.copy(alpha = 0.15f),
                    CircleShape
                ),
            contentAlignment = Alignment.Center
        ) {
            IconButton(
                onClick = { /* Handle bookmark action */ },
                modifier = Modifier.size(36.dp)
            ) {
                Icon(
                    painter = painterResource(R.drawable.bookmark),
                    contentDescription = "Bookmark profile",
                    modifier = Modifier.size(18.dp),
                    tint = AppColors.Black
                )
            }
        }
    }
}