package com.mirfanrafif.smartumkm.core.datasource.local

import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pasar
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk
import com.mirfanrafif.smartumkm.utils.DummyData

class SmartHargaLocalDataSource {
    fun getListPasar(): List<Pasar> = DummyData.dummyPasar
    fun getListProduk(): List<Produk> = DummyData.dummyProduk
}