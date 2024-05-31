package com.huzil.chatterix.presentation.authentication

import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.hilt.navigation.compose.hiltViewModel

class AuthenticationCoordinator(
    private val viewModel: AuthenticationViewModel,
) {
    val screenStateFlow = viewModel.stateFlow

    fun onGoogleSignInClick() = viewModel::googleSignIn

    fun onEmailSignInClick() = viewModel::emailSignIn
 }

@Composable
fun rememberAuthenticationCoordinator(
    viewModel: AuthenticationViewModel = hiltViewModel(),
): AuthenticationCoordinator {
    return remember(viewModel) {
        AuthenticationCoordinator(viewModel)
    }
}