package com.mirfanrafif.smartumkm.core.repository.smartacara

import com.mirfanrafif.smartumkm.core.datasource.local.entity.Acara
import com.mirfanrafif.smartumkm.core.datasource.local.entity.KategoriAcara

interface ISmartAcaraRepository {
    fun getListKategori(): List<KategoriAcara>
    fun getAcara(): List<Acara>
    fun searchAcara(keyword: String): List<Acara>
}