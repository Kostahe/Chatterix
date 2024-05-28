package com.huzil.chatterix.presentation.authentication.register

import androidx.compose.ui.tooling.preview.PreviewParameterProvider

/**
 * UI State that represents RegisterScreen
 **/
data class RegisterState(
    val text: String = ""
)

/**
 * Register Actions emitted from the UI Layer
 * passed to the coordinator to handle
 **/
data class RegisterActions(
    val onClick: () -> Unit = {}
)


/**
 * PreviewParameter Provider for RegisterScreen Preview
 * Add values to the sequence to see the preview in different states
 **/
class RegisterStatePreviewParameterProvider : PreviewParameterProvider<RegisterState> {
    override val values: Sequence<RegisterState>
        get() = sequenceOf(

        )
}
