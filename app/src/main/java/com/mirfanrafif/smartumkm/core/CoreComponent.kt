package com.mirfanrafif.smartumkm.core

import android.content.Context
import com.mirfanrafif.smartumkm.core.repository.modules.SmartLabaModule
import com.mirfanrafif.smartumkm.core.repository.modules.UserModule
import com.mirfanrafif.smartumkm.core.repository.smartlaba.ISmartLabaRepository
import com.mirfanrafif.smartumkm.core.repository.user.IUserRepository
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton


@Component(
    modules = [
        UserModule::class,
        SmartLabaModule::class
    ]
)
@Singleton
interface CoreComponent {
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): CoreComponent
    }

    fun provideUserRepository(): IUserRepository

    fun provideSmartLabaRepository(): ISmartLabaRepository
}
