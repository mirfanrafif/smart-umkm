package com.mirfanrafif.smartumkm.core.repository.user

import com.mirfanrafif.smartumkm.core.datasource.local.entity.User

interface IUserRepository {
    fun getUser(): User
    fun login(user: User)
    fun daftar(user: User)
}