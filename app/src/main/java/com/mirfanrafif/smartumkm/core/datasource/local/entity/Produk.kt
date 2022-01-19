package com.mirfanrafif.smartumkm.core.datasource.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Produk(
    val nama: String,
    val jumlah: Int,
    val harga: Int
): Parcelable
