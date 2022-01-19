package com.mirfanrafif.smartumkm.core.datasource.local

import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pengeluaran
import com.mirfanrafif.smartumkm.utils.DummyData
import javax.inject.Singleton

@Singleton
class SmartLabaLocalDataSource {
    fun getPengeluaranList() = DummyData.dummyPengeluaran
}