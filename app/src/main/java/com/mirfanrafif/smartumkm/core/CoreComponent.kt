package com.mirfanrafif.smartumkm.core

import android.content.Context
import com.mirfanrafif.smartumkm.core.repository.modules.UserModule
import com.mirfanrafif.smartumkm.core.repository.user.IUserRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        UserModule::class
    ]
)
interface CoreComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }

    fun provideUserRepository(): IUserRepository
}
