package com.mirfanrafif.smartumkm.view.viewmodel

import androidx.lifecycle.ViewModel
import com.mirfanrafif.smartumkm.core.repository.user.IUserRepository
import com.mirfanrafif.smartumkm.core.repository.user.UserRepository
import javax.inject.Inject

class DashboardViewModel @Inject constructor (private val repository: IUserRepository): ViewModel() {
    fun getUser() = repository.getUser()
}