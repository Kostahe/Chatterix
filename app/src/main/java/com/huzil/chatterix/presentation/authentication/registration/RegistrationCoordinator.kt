package com.huzil.chatterix.presentation.authentication.registration

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

/**
 * Screen's coordinator which is responsible for handling actions from the UI layer
 * and one-shot actions based on the new UI state
 */
class RegistrationCoordinator(
    val viewModel: RegistrationViewModel
) {
    val screenStateFlow = viewModel.stateFlow

    fun doStuff() {
        viewModel
    }
}

@Composable
fun rememberRegistrationCoordinator(
    viewModel: RegistrationViewModel = hiltViewModel()
): RegistrationCoordinator {
    return remember(viewModel) {
        RegistrationCoordinator(
            viewModel = viewModel
        )
    }
}