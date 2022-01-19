package com.mirfanrafif.smartumkm.core.datasource.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Pasar(
    val nama: String,
    val gambar: Int
): Parcelable