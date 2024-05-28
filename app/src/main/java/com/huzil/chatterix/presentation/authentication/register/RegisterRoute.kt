package com.huzil.chatterix.presentation.authentication.register

import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember

@Composable
fun RegisterRoute(
    coordinator: RegisterCoordinator = rememberRegisterCoordinator()
) {
    // State observing and declarations
    val uiState by coordinator.screenStateFlow.collectAsState(RegisterState())

    // UI Actions
    val actions = rememberRegisterActions(coordinator)

    // UI Rendering
    RegisterScreen(uiState, actions)
}


@Composable
fun rememberRegisterActions(coordinator: RegisterCoordinator): RegisterActions {
    return remember(coordinator) {
        RegisterActions(

        )
    }
}