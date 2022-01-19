package com.mirfanrafif.smartumkm.core.repository.modules

import com.mirfanrafif.smartumkm.core.datasource.local.SmartHargaLocalDataSource
import com.mirfanrafif.smartumkm.core.repository.smartharga.ISmartHargaRepository
import com.mirfanrafif.smartumkm.core.repository.smartharga.SmartHargaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class SmartHargaModule {
    @Provides
    fun provideSmartHargaLocalDataSource(): SmartHargaLocalDataSource = SmartHargaLocalDataSource()

    @Provides
    fun provideSmartHargaRepository(localDataSource: SmartHargaLocalDataSource): ISmartHargaRepository = SmartHargaRepository(localDataSource)
}