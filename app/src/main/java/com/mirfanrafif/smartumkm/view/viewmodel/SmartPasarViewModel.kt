package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.repository.smartpasar.ISmartPasarRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SmartPasarViewModel @Inject constructor (private val repository: ISmartPasarRepository): ViewModel() {
    fun getListBarang() = repository.getListBarang()

    fun getListHarga() = repository.getHargaBarangDiPasar()
}