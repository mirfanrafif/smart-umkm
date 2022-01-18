package com.mirfanrafif.smartumkm.core.datasource.local

import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pengeluaran
import javax.inject.Singleton

@Singleton
class SmartLabaDataSource {
    fun getPengeluaranList() = arrayListOf(
        Pengeluaran("Biaya Bahan Baku", R.drawable.bahan_baku, 650000),
        Pengeluaran("Biaya Transportasi", R.drawable.transportasi, 900000),
        Pengeluaran("Biaya Tenaga Kerja", R.drawable.tenaga_kerja, 850000)
    )
}