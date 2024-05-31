package com.huzil.chatterix.presentation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.navigation
import com.huzil.chatterix.presentation.authentication.AuthenticationRoute
import kotlinx.serialization.Serializable

@Composable
fun AppNavGraph(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NavGraphRoutes.AuthenticationNavigation
    ) {
        navigation<NavGraphRoutes.AuthenticationNavigation>(
            startDestination = NavigationRoutes.AuthenticationScreen
        ) {
            composable<NavigationRoutes.AuthenticationScreen> {
                AuthenticationRoute()
            }
        }
    }
}

sealed class NavGraphRoutes() {
    @Serializable
    object AuthenticationNavigation: NavGraphRoutes()
}

sealed class NavigationRoutes() {
    @Serializable
    object AuthenticationScreen: NavigationRoutes()
}