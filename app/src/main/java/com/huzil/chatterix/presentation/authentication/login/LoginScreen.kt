package com.huzil.chatterix.presentation.authentication.login

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter

@Composable
fun LoginScreen(
    state: LoginState,
    actions: LoginActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Login")
private fun LoginScreenPreview(
    @PreviewParameter(LoginStatePreviewParameterProvider::class)
    state: LoginState
) {
    LoginScreen(
        state = state,
        actions = LoginActions()
    )
}
