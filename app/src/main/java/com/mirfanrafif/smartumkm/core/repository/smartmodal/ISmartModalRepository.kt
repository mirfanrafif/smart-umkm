package com.mirfanrafif.smartumkm.core.repository.smartmodal

import com.mirfanrafif.smartumkm.core.datasource.local.entity.Investasi
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kredit

interface ISmartModalRepository {
    fun getAllKredit(): List<Kredit>
    fun getAllInvestasi(): List<Investasi>
}