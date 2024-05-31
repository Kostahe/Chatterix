package com.huzil.chatterix.presentation.authentication.registration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun RegistrationRoute(
    coordinator: RegistrationCoordinator = rememberRegistrationCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(RegistrationState())

    // UI Actions
    val actions = rememberRegistrationActions(coordinator)

    // UI Rendering
    RegistrationScreen(uiState, actions)
}


@Composable
fun rememberRegistrationActions(coordinator: RegistrationCoordinator): RegistrationActions {
    return remember(coordinator) {
        RegistrationActions(

        )
    }
}