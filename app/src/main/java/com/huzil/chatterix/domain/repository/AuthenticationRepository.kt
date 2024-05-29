package com.huzil.chatterix.domain.repository

interface AuthenticationRepository {
    suspend fun register(email: String, password: String)
    suspend fun signInWithGoogle()
}