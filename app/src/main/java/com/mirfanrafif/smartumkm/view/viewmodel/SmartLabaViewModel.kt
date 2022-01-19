package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.repository.smartlaba.ISmartLabaRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SmartLabaViewModel @Inject constructor(private val repository: ISmartLabaRepository): ViewModel() {
    fun getPengeluaranList() = repository.getPengeluaranList()
}