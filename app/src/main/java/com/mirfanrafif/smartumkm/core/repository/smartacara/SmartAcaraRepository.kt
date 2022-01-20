package com.mirfanrafif.smartumkm.core.repository.smartacara

import com.mirfanrafif.smartumkm.core.datasource.local.SmartAcaraLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Acara
import com.mirfanrafif.smartumkm.core.datasource.local.entity.KategoriAcara
import javax.inject.Inject

class SmartAcaraRepository @Inject constructor (private val localDataSource: SmartAcaraLocalDataSource): ISmartAcaraRepository {
    override fun getListKategori(): List<KategoriAcara> {
        return localDataSource.getKategoriAcara()
    }

    override fun getAcara(): List<Acara> {
        return localDataSource.getListAcara()
    }

    override fun searchAcara(keyword: String): List<Acara> {
        if (keyword.isBlank()) {
            return arrayListOf()
        }else {
            return localDataSource.getListAcara().filter { acara ->
                acara.nama.contains(keyword, true)
            }
        }
    }
}