package com.huzil.chatterix.presentation.authentication.login

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * UI State that represents LoginScreen
 **/
data class LoginState(
    val test: String = ""
)

/**
 * Login Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class LoginActions(
    val onClick: () -> Unit = {}
)


/**
 * PreviewParameter Provider for LoginScreen Preview
 * Add values to the sequence to see the preview in different states
 **/
class LoginStatePreviewParameterProvider : PreviewParameterProvider<LoginState> {
    override val values: Sequence<LoginState>
        get() = sequenceOf(

        )
}
