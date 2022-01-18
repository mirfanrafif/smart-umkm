package com.mirfanrafif.smartumkm.core.repository.modules

import android.content.Context
import com.mirfanrafif.smartumkm.core.datasource.local.UserLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.IUserPreferences
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.UserPreferences
import com.mirfanrafif.smartumkm.core.repository.user.IUserRepository
import com.mirfanrafif.smartumkm.core.repository.user.UserRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class UserModule {
    @Singleton
    @Provides
    fun provideUserPreferences(context: Context): IUserPreferences = UserPreferences(context)

    @Provides
    fun provideUserRepository(localDataSource: UserLocalDataSource): IUserRepository = UserRepository(localDataSource)
}