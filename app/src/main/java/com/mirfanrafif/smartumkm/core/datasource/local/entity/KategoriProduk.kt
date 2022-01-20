package com.mirfanrafif.smartumkm.core.datasource.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class KategoriProduk(
    val nama: String,
    val deskripsi: String
): Parcelable
