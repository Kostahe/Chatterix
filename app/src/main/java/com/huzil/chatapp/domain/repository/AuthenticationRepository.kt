package com.huzil.chatapp.domain.repository

interface AuthenticationRepository {
    suspend fun register(email: String, password: String)
}