package com.huzil.chatterix.presentation.authentication

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

data class AuthenticationState(
    val loading: Boolean = false
)

data class AuthenticationActions(
    val onGoogleSignInClick: () -> Unit = {},
    val onEmailSignInClick: () -> Unit = {}
)

class AuthenticationStatePreviewParameterProvider : PreviewParameterProvider<AuthenticationState> {
    override val values: Sequence<AuthenticationState>
        get() = sequenceOf(

        )
}
