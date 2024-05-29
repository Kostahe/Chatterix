package com.huzil.chatterix.di

import com.huzil.chatterix.presentation.util.NavControllerHolder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NavigationModule {
    @Provides
    @Singleton
    fun provideNavControllerHolder(): NavControllerHolder = NavControllerHolder()
}

