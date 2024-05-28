package com.huzil.chatterix.presentation.authentication.register

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter

@Composable
fun RegisterScreen(
    state: RegisterState,
    actions: RegisterActions,
) {
    // TODO UI Rendering
}

@Composable
@Preview(name = "Register")
private fun RegisterScreenPreview(
    @PreviewParameter(RegisterStatePreviewParameterProvider::class)
    state: RegisterState
) {
    RegisterScreen(
        state = state,
        actions = RegisterActions()
    )
}
