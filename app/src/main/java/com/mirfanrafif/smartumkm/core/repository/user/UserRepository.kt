package com.mirfanrafif.smartumkm.core.repository.user

import com.mirfanrafif.smartumkm.core.datasource.local.UserLocalDataSource
import com.mirfanrafif.smartumkm.core.datasource.local.entity.User
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor (private val local: UserLocalDataSource): IUserRepository {

    override fun login(user: User) {
        user.nama = "Irfan Rafif"
        local.setUser(user)
    }

    override fun daftar(user: User) {
        local.setUser(user)
    }

    override fun getUser() = local.getUser()
}