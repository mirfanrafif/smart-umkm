package com.mirfanrafif.smartumkm.core.repository.smartpasar

import com.mirfanrafif.smartumkm.core.datasource.local.entity.Barang
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.Harga

interface ISmartPasarRepository {
    fun getListBarang(): List<Barang>
    fun getHargaBarangDiPasar(): List<Harga>
}