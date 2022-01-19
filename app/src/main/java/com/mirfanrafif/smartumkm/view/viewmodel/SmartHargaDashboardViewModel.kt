package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Pasar
import com.mirfanrafif.smartumkm.core.repository.smartharga.ISmartHargaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SmartHargaDashboardViewModel @Inject constructor (private val repository: ISmartHargaRepository): ViewModel() {
    fun getListPasar(): List<Pasar> = repository.getListPasar()
}