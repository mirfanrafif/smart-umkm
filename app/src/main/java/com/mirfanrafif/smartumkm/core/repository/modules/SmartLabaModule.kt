package com.mirfanrafif.smartumkm.core.repository.modules

import com.mirfanrafif.smartumkm.core.datasource.local.SmartLabaDataSource
import com.mirfanrafif.smartumkm.core.repository.smartlaba.ISmartLabaRepository
import com.mirfanrafif.smartumkm.core.repository.smartlaba.SmartLabaRepository
import dagger.Module
import dagger.Provides

@Module
class SmartLabaModule {

    @Provides
    fun provideSmartLabaDataSource(): SmartLabaDataSource = SmartLabaDataSource()

    @Provides
    fun provideSmartLabaRepository(smartLabaDataSource: SmartLabaDataSource): ISmartLabaRepository = SmartLabaRepository(smartLabaDataSource)
}