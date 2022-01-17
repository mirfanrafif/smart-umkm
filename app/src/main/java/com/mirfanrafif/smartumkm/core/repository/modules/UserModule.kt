package com.mirfanrafif.smartumkm.core.repository.modules

import android.content.Context
import com.mirfanrafif.smartumkm.core.datasource.local.UserLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.IUserPreferences
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.UserPreferences
import com.mirfanrafif.smartumkm.core.repository.user.IUserRepository
import com.mirfanrafif.smartumkm.core.repository.user.UserRepository
import dagger.Module
import dagger.Provides

@Module
class UserModule {
    @Provides
    fun provideUserPreferences(context: Context): IUserPreferences = UserPreferences(context)

    @Provides
    fun provideUserRepository(localDataSource: UserLocalDataSource): IUserRepository = UserRepository(localDataSource)
}