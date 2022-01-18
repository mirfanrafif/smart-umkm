package com.mirfanrafif.smartumkm.core.datasource.local.preferences

import com.mirfanrafif.smartumkm.core.datasource.local.entity.User
import javax.inject.Singleton

@Singleton
interface IUserPreferences {
    fun setUser(user: User)
    fun getUser(): User
}