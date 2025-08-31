package com.example.onboardingcarouseltemplate.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.onboardingcarouseltemplate.screens.HomeScreen
import com.example.onboardingcarouseltemplate.screens.OnboardingCarousel
import com.example.onboardingcarouseltemplate.screens.SplashScreen

sealed class Screen(val route: String) {
    object Splash : Screen("splash")
    object Onboarding : Screen("onboarding")
    object Home : Screen("home")
}

@Composable
fun AppNavGraph(navController: NavHostController = rememberNavController()) {
    NavHost(
        navController = navController, startDestination = Screen.Splash.route
    ) {
        composable(Screen.Splash.route) {
            SplashScreen(navController)
        }
        composable(Screen.Onboarding.route) {
            OnboardingCarousel(navController)
        }
        composable(Screen.Home.route) {
            HomeScreen(navController)
        }
    }
}
