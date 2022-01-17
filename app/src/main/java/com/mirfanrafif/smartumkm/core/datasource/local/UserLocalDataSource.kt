package com.mirfanrafif.smartumkm.core.datasource.local

import com.mirfanrafif.smartumkm.core.datasource.local.entity.User
import com.mirfanrafif.smartumkm.core.datasource.local.preferences.IUserPreferences
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserLocalDataSource @Inject constructor (private val userPreferences: IUserPreferences) {
    fun getUser() = userPreferences.getUser()

    fun setUser(user: User) = userPreferences.setUser(user)
}