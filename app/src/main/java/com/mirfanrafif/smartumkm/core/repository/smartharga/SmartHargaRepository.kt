package com.mirfanrafif.smartumkm.core.repository.smartharga

import com.mirfanrafif.smartumkm.core.datasource.local.SmartHargaLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pasar
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk
import javax.inject.Inject

class SmartHargaRepository @Inject constructor (private val localDataSource: SmartHargaLocalDataSource): ISmartHargaRepository {
    override fun getListPasar(): List<Pasar> {
        return localDataSource.getListPasar()
    }

    override fun getListHarga(id: Int): List<Produk> {
        return localDataSource.getListProduk()
    }
}