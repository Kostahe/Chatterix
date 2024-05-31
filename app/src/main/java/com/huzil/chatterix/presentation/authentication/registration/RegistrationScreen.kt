package com.huzil.chatterix.presentation.authentication.registration

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.huzil.chatterix.presentation.ui.theme.ChatterixTheme

@Composable
fun RegistrationScreen(
    state: RegistrationState,
    actions: RegistrationActions,
) {

}

@Composable
@Preview(name = "Registration")
private fun RegistrationScreenPreview() {
    ChatterixTheme {
        RegistrationScreen(
            state = RegistrationState(),
            actions = RegistrationActions()
        )
    }
}
