package com.mirfanrafif.smartumkm.core.repository.smartharga

import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pasar
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk

interface ISmartHargaRepository {
    fun getListPasar(): List<Pasar>
    fun getListHarga(id: Int): List<Produk>
}