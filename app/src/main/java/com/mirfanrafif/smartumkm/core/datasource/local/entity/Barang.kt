package com.mirfanrafif.smartumkm.core.datasource.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Barang(
    val kategori: String,
    val imageUrl: Int,
    val nama: String,
    val harga: Int,
    val lokasi: String
): Parcelable