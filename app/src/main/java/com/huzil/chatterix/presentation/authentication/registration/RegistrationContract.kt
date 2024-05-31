package com.huzil.chatterix.presentation.authentication.registration

import androidx.compose.runtime.Composable

/**
 * UI State that represents RegistrationScreen
 **/
data class RegistrationState(
    val text: String = ""
)

/**
 * Registration Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class RegistrationActions(
    val onClick: () -> Unit = {}
)


