package com.example.onboardingcarouseltemplate.models


import androidx.annotation.DrawableRes
import com.example.onboardingcarouseltemplate.R

data class OnboardingPage(
    val title: String,
    val description: String,
    @DrawableRes val image: Int
)

val onboardingPages = listOf(
    OnboardingPage(
        "Manage Your Task",
        "You can easily manage all of your daily tasks in DoMe for free",
        R.drawable.image1
    ),
    OnboardingPage(
        "Track Your Progress",
        "Stay on top of your work and track daily achievements",
        R.drawable.image2
    ),
    OnboardingPage(
        "Achieve Your Goals",
        "Organize and accomplish goals faster with UPTasker",
        R.drawable.image3
    )
)

