package com.mirfanrafif.smartumkm.core.repository.modules

import com.mirfanrafif.smartumkm.core.datasource.SmartModalLocalDataSource
import com.mirfanrafif.smartumkm.core.repository.smartmodal.ISmartModalRepository
import com.mirfanrafif.smartumkm.core.repository.smartmodal.SmartModalRepository
import dagger.Module
import dagger.Provides

@Module
class SmartModalModule {
    @Provides
    fun provideLocalDataSource(): SmartModalLocalDataSource = SmartModalLocalDataSource()

    @Provides
    fun provideRepository(smartModalLocalDataSource: SmartModalLocalDataSource): ISmartModalRepository = SmartModalRepository(smartModalLocalDataSource)
}