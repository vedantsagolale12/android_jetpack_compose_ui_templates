package com.example.bottomnav.ui.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.bottomnav.ui.screens.DashboardScreen
import com.example.bottomnav.ui.screens.HomeScreen
import com.example.bottomnav.ui.screens.ProfileScreen
import com.example.bottomnav.ui.screens.SettingsScreen

@Composable
fun NavigationGraph(
    navController: NavHostController,
    modifier: Modifier = Modifier,
    isDarkTheme: Boolean = false,
    onThemeChange: (Boolean) -> Unit = {}
) {
    NavHost(
        navController = navController,
        startDestination = "home",
        modifier = modifier
    ) {
        composable("home") {
            HomeScreen()
        }
        composable("dashboard") {
            DashboardScreen()
        }
        composable("profile") {
            ProfileScreen()
        }
        composable("settings") {
            SettingsScreen(
                isDarkTheme = isDarkTheme,
                onThemeChange = onThemeChange
            )
        }
    }
}