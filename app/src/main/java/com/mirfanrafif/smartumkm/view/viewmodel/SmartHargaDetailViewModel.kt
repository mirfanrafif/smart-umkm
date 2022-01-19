package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Produk
import com.mirfanrafif.smartumkm.core.repository.smartharga.ISmartHargaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SmartHargaDetailViewModel @Inject constructor (private val repository: ISmartHargaRepository): ViewModel() {
    fun getListProduk(): List<Produk> = repository.getListHarga(1)
}