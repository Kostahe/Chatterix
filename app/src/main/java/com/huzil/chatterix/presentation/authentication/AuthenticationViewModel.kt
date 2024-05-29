package com.huzil.chatterix.presentation.authentication

import androidx.lifecycle.ViewModel
import com.huzil.chatterix.presentation.util.NavControllerHolder
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import javax.inject.Inject

@HiltViewModel
class AuthenticationViewModel @Inject constructor(
    private val navControllerHolder: NavControllerHolder
): ViewModel() {

    private val _stateFlow: MutableStateFlow<AuthenticationState> = MutableStateFlow(AuthenticationState())
    val stateFlow: StateFlow<AuthenticationState> = _stateFlow.asStateFlow()

    fun googleSignIn() {

    }

    fun emailSignIn() {

    }

}