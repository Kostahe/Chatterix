package com.huzil.chatapp.data.repository

import com.google.firebase.auth.FirebaseAuth
import com.huzil.chatapp.domain.repository.AuthenticationRepository
import kotlin.coroutines.cancellation.CancellationException
import kotlinx.coroutines.tasks.await
import javax.inject.Inject

class AuthenticationRepositoryImpl @Inject constructor(
    private val authentication: FirebaseAuth
) : AuthenticationRepository {
    override suspend fun register(email: String, password: String) {
        try {
            authentication.createUserWithEmailAndPassword(email, password).await()
        } catch (e: Exception) {
            if (e is CancellationException) throw e
        }
    }
}