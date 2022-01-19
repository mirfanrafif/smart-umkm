package com.mirfanrafif.smartumkm.utils

import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Investasi
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kredit
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pengeluaran

object DummyData {
    val dummyPengeluaran = arrayListOf(
        Pengeluaran("Biaya Bahan Baku", R.drawable.bahan_baku, 650000),
        Pengeluaran("Biaya Transportasi", R.drawable.transportasi, 900000),
        Pengeluaran("Biaya Tenaga Kerja", R.drawable.tenaga_kerja, 850000)
    )

    val dummyKredit = arrayListOf(
        Kredit("BMT Bojonegoro", R.drawable.bmt, 650000),
        Kredit("Koperasi", R.drawable.koperasi, 900000),
        Kredit("Bank BRI", R.drawable.bri, 850000)
    )

    val dummyInvestasi = arrayListOf(
        Investasi("Properti", R.drawable.house),
        Investasi("Emas", R.drawable.emas),
        Investasi("Saham", R.drawable.saham)
    )
}