package com.mirfanrafif.smartumkm.core.repository.smartlaba

import com.mirfanrafif.smartumkm.core.datasource.local.SmartLabaLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pengeluaran
import javax.inject.Inject


class SmartLabaRepository @Inject constructor(private val smartLabaLocalDataSource: SmartLabaLocalDataSource) : ISmartLabaRepository {
    override fun getPengeluaranList(): List<Pengeluaran> = smartLabaLocalDataSource.getPengeluaranList()
}