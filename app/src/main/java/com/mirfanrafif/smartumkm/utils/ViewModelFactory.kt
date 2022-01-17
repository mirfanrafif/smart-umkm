package com.mirfanrafif.smartumkm.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mirfanrafif.smartumkm.core.repository.user.UserRepository
import com.mirfanrafif.smartumkm.view.viewmodel.DashboardViewModel
import com.mirfanrafif.smartumkm.view.viewmodel.LoginViewModel
import javax.inject.Inject

@Suppress("UNCHECKED_CAST")
@AppScope
class ViewModelFactory @Inject constructor(private val userRepository: UserRepository): ViewModelProvider.NewInstanceFactory() {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(LoginViewModel::class.java) -> LoginViewModel(userRepository) as T
            modelClass.isAssignableFrom(DashboardViewModel::class.java) -> DashboardViewModel(userRepository) as T
            else -> throw Throwable("Unknown viewmodel class")
        }
    }
}