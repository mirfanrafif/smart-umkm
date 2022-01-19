package com.mirfanrafif.smartumkm.core.datasource

import com.mirfanrafif.smartumkm.core.datasource.local.entity.Investasi
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kredit
import com.mirfanrafif.smartumkm.utils.DummyData

class SmartModalLocalDataSource {
    fun getAllKredit(): List<Kredit> = DummyData.dummyKredit
    fun getAllInvestasi(): List<Investasi> = DummyData.dummyInvestasi
}