package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Investasi
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Kredit
import com.mirfanrafif.smartumkm.core.repository.smartmodal.ISmartModalRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SmartModalViewModel @Inject constructor( private val repository: ISmartModalRepository): ViewModel() {
    fun getAllKredit(): List<Kredit> = repository.getAllKredit()

    fun getAllInvestasi(): List<Investasi> = repository.getAllInvestasi()
}