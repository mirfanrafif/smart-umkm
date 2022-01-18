package com.mirfanrafif.smartumkm.core.repository.smartlaba

import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pengeluaran

interface ISmartLabaRepository {
    fun getPengeluaranList(): List<Pengeluaran>
}