package com.huzil.chatapp.di

import com.google.firebase.auth.FirebaseAuth
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Singleton

@Module
@InstallIn(Singleton::class)
object FirebaseModule {

    @Singleton
    @Provides
    fun provideAuthentication() = FirebaseAuth.getInstance()
}