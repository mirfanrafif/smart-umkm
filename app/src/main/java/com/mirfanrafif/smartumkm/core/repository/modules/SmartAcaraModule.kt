package com.mirfanrafif.smartumkm.core.repository.modules

import com.mirfanrafif.smartumkm.core.datasource.local.SmartAcaraLocalDataSource
import com.mirfanrafif.smartumkm.core.repository.smartacara.ISmartAcaraRepository
import com.mirfanrafif.smartumkm.core.repository.smartacara.SmartAcaraRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class SmartAcaraModule {
    @Provides
    fun provideLocalDataSource(): SmartAcaraLocalDataSource = SmartAcaraLocalDataSource()

    @Provides
    fun provideSmartAcaraRepository(localDataSource: SmartAcaraLocalDataSource): ISmartAcaraRepository =
        SmartAcaraRepository(localDataSource)
}