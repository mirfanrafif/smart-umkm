package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.datasource.local.entity.Acara
import com.mirfanrafif.smartumkm.core.datasource.local.entity.KategoriAcara
import com.mirfanrafif.smartumkm.core.repository.smartacara.SmartAcaraRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SmartAcaraDashboardViewModel @Inject constructor(private val repository: SmartAcaraRepository): ViewModel() {
    fun getKategoriAcaraList(): List<KategoriAcara> = repository.getListKategori()

    private val _searchAcaraKeyword: MutableLiveData<String> = MutableLiveData("")
    fun searchKeyword(): LiveData<String> = _searchAcaraKeyword

    private val searchAcara: MutableLiveData<List<Acara>> = MutableLiveData()
    fun acaraListSearch(): LiveData<List<Acara>> = searchAcara

    fun searchAcara(keyword: String) {
        val acara = repository.searchAcara(keyword)
        searchAcara.postValue(acara)
    }

    fun setKeyword(keyword: String) {
        _searchAcaraKeyword.postValue(keyword)
    }

    fun getListAcara(): List<Acara> = repository.getAcara()

    private val selectedAcara: MutableLiveData<Acara> = MutableLiveData()
    fun setAcara(acara: Acara) {
        selectedAcara.postValue(acara)
    }
    fun getSelectedAcara(): LiveData<Acara> = selectedAcara
}