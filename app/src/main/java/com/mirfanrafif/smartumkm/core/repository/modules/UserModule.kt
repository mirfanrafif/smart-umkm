package com.mirfanrafif.smartumkm.core.repository.modules

import android.content.Context
import com.mirfanrafif.smartumkm.core.datasource.local.UserLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.IUserPreferences
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.UserPreferences
import com.mirfanrafif.smartumkm.core.repository.user.IUserRepository
import com.mirfanrafif.smartumkm.core.repository.user.UserRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class UserModule {
    @Singleton
    @Provides
    fun provideUserPreferences(@ApplicationContext context: Context): IUserPreferences = UserPreferences(context)

    @Provides
    fun provideUserRepository(localDataSource: UserLocalDataSource): IUserRepository = UserRepository(localDataSource)
}