package com.mirfanrafif.smartumkm.core.datasource.local.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Acara(
    val nama: String,
    val gambar: Int,
    val tanggalMulai: String,
    val tanggalSelesai: String,
    val kuota: Int,
    val lokasi: String,
    val deskripsi: String,
    val durasi: Int,
    val manfaat: String,
    val registrasi: Int,
    val penyelenggara: String
): Parcelable
