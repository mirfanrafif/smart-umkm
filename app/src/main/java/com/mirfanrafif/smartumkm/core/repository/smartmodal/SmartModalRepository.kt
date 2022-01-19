package com.mirfanrafif.smartumkm.core.repository.smartmodal

import com.mirfanrafif.smartumkm.core.datasource.local.SmartModalLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Investasi
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kredit
import javax.inject.Inject

class SmartModalRepository @Inject constructor(private val smartModalLocalDataSource: SmartModalLocalDataSource): ISmartModalRepository {
    override fun getAllKredit(): List<Kredit> {
        return smartModalLocalDataSource.getAllKredit()
    }

    override fun getAllInvestasi(): List<Investasi> {
        return smartModalLocalDataSource.getAllInvestasi()
    }
}