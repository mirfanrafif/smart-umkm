package com.mirfanrafif.smartumkm.core.datasource.local.preferences

import android.content.Context
import androidx.core.content.edit
import com.mirfanrafif.smartumkm.core.datasource.local.entity.User
import javax.inject.Singleton

@Singleton
class UserPreferences (context: Context): IUserPreferences {

    companion object {
        private const val PREFS_NAME = "smart_umkm"
        private const val NAMA = "nama"
        private const val USERNAME = "username"
        private const val PASSWORD = "password"
    }

    private val preferences = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    override fun getUser(): User {
        val nama = preferences.getString(NAMA, null)
        val username = preferences.getString(USERNAME, null)
        val password = preferences.getString(PASSWORD, null)

        return User(nama, username, password)
    }

    override fun setUser(user: User) {
        preferences.edit {
            putString(NAMA, user.nama)
            putString(USERNAME, user.username)
            putString(PASSWORD, user.password)
        }
    }
}