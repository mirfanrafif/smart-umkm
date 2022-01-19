package com.mirfanrafif.smartumkm.core.repository.modules

import com.mirfanrafif.smartumkm.core.datasource.local.SmartLabaLocalDataSource
import com.mirfanrafif.smartumkm.core.repository.smartlaba.ISmartLabaRepository
import com.mirfanrafif.smartumkm.core.repository.smartlaba.SmartLabaRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
class SmartLabaModule {

    @Provides
    fun provideSmartLabaDataSource(): SmartLabaLocalDataSource = SmartLabaLocalDataSource()

    @Provides
    fun provideSmartLabaRepository(smartLabaLocalDataSource: SmartLabaLocalDataSource): ISmartLabaRepository = SmartLabaRepository(smartLabaLocalDataSource)
}