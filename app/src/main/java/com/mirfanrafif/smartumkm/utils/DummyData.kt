package com.mirfanrafif.smartumkm.utils

import com.mirfanrafif.smartumkm.R
import com.mirfanrafif.smartumkm.core.datasource.local.entity.*

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

    val dummyPasar = arrayListOf(
        Pasar("Pasar Senen Jakarta", R.drawable.pasar),
        Pasar("Pasar Kebayoran Lama", R.drawable.pasar),
        Pasar("Pasar Kebayoran Baru", R.drawable.pasar)
    )

    val dummyProduk = arrayListOf(
        Produk("Tomat", 1, 10000),
        Produk("Wortel", 1, 12000),
        Produk("Terong", 1, 15000),
        Produk("Mentimun", 1, 8000),
        Produk("Cabai", 1, 20000)
    )
}