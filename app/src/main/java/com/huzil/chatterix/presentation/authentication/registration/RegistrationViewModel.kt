package com.huzil.chatterix.presentation.authentication.registration

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

@HiltViewModel
class RegistrationViewModel @Inject constructor(
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val _stateFlow: MutableStateFlow<RegistrationState> =
        MutableStateFlow(RegistrationState())

    val stateFlow: StateFlow<RegistrationState> = _stateFlow.asStateFlow()


}