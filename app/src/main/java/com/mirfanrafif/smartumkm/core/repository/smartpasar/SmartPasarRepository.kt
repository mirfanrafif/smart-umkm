package com.mirfanrafif.smartumkm.core.repository.smartpasar

import com.mirfanrafif.smartumkm.core.datasource.local.SmartPasarLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Barang
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.Harga
import javax.inject.Inject

class SmartPasarRepository @Inject constructor(private val localDataSource: SmartPasarLocalDataSource): ISmartPasarRepository {
    override fun getListBarang(): List<Barang> {
        return localDataSource.getListBarang()
    }

    override fun getHargaBarangDiPasar(): List<Harga> {
        return localDataSource.getListHarga()
    }
}