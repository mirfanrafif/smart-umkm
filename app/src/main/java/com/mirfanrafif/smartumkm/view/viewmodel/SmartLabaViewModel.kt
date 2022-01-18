package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.repository.smartlaba.ISmartLabaRepository
import javax.inject.Inject

class SmartLabaViewModel @Inject constructor(private val repository: ISmartLabaRepository): ViewModel() {
    fun getPengeluaranList() = repository.getPengeluaranList()
}