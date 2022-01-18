package com.mirfanrafif.smartumkm.core.repository.smartlaba

import com.mirfanrafif.smartumkm.core.datasource.local.SmartLabaDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pengeluaran
import javax.inject.Inject


class SmartLabaRepository @Inject constructor(private val smartLabaDataSource: SmartLabaDataSource) : ISmartLabaRepository {
    override fun getPengeluaranList(): List<Pengeluaran> = smartLabaDataSource.getPengeluaranList()
}