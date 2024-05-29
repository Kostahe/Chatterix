package com.huzil.chatterix.data.repository

//import com.huzil.chatterix.BuildConfig
import android.content.Context
import com.google.firebase.auth.FirebaseAuth
import com.huzil.chatterix.domain.repository.AuthenticationRepository
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.tasks.await
import javax.inject.Inject
import kotlin.coroutines.cancellation.CancellationException

class AuthenticationRepositoryImpl @Inject constructor(
    private val authentication: FirebaseAuth,
    @ApplicationContext private val context: Context
) : AuthenticationRepository {
    override suspend fun register(email: String, password: String) {
        try {
            authentication.createUserWithEmailAndPassword(email, password).await()
        } catch (e: Exception) {
            if (e is CancellationException) throw e
        }
    }

    override suspend fun signInWithGoogle() {
//        val webClientId = BuildConfig.WEB_CLIENT_ID
//        val googleIdOption = GetGoogleIdOption.Builder()
//            .setFilterByAuthorizedAccounts(true)
//            .setServerClientId(BuildConfig.WEB_CLIENT_ID)
//            .build()
    }
}