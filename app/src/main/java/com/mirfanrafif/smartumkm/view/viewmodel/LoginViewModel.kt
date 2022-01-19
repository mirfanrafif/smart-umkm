package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.datasource.local.entity.User
import com.mirfanrafif.smartumkm.core.repository.user.IUserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class LoginViewModel @Inject constructor (private val repository: IUserRepository): ViewModel() {
    fun login(username: String, password: String) {
        repository.login(User(null, username, password))
    }

    fun daftar(nama: String, username: String, password: String) {
        repository.daftar(User(nama, username, password))
    }
}