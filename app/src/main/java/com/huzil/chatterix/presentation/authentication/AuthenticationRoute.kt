package com.huzil.chatterix.presentation.authentication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import com.huzil.chatterix.presentation.authentication.registration.RegistrationActions
import com.huzil.chatterix.presentation.authentication.registration.RegistrationCoordinator
import com.huzil.chatterix.presentation.authentication.registration.RegistrationScreen
import com.huzil.chatterix.presentation.authentication.registration.RegistrationState
import com.huzil.chatterix.presentation.authentication.registration.rememberRegistrationCoordinator

@Composable
fun AuthenticationRoute(
    coordinator: AuthenticationCoordinator = rememberAuthenticationCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState()

    // UI Actions
    val actions = rememberAuthenticationActions(coordinator)

    // UI Rendering
    AuthenticationScreen(uiState, actions)
}


@Composable
fun rememberAuthenticationActions(coordinator: AuthenticationCoordinator): AuthenticationActions {
    return remember(coordinator) {
        AuthenticationActions(
            onGoogleSignInClick = coordinator::onGoogleSignInClick,
            onEmailSignInClick = coordinator::onEmailSignInClick
        )
    }
}