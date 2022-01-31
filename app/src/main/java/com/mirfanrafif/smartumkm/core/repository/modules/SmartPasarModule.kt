package com.mirfanrafif.smartumkm.core.repository.modules

import com.mirfanrafif.smartumkm.core.datasource.local.SmartPasarLocalDataSource
import com.mirfanrafif.smartumkm.core.repository.smartpasar.ISmartPasarRepository
import com.mirfanrafif.smartumkm.core.repository.smartpasar.SmartPasarRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class SmartPasarModule {
    @Provides
    fun provideLocalDataSource() : SmartPasarLocalDataSource = SmartPasarLocalDataSource()

    @Provides
    fun provideSmartPasarRepository(localDataSource: SmartPasarLocalDataSource): ISmartPasarRepository = SmartPasarRepository(localDataSource)
}