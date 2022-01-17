package com.mirfanrafif.smartumkm

import com.mirfanrafif.smartumkm.core.CoreComponent
import com.mirfanrafif.smartumkm.utils.AppScope
import com.mirfanrafif.smartumkm.view.activities.DashboardActivity
import com.mirfanrafif.smartumkm.view.activities.LoginActivity
import com.mirfanrafif.smartumkm.view.fragments.DaftarFragment
import com.mirfanrafif.smartumkm.view.fragments.LoginFragment
import dagger.Component

@AppScope
@Component(
    dependencies = [
        CoreComponent::class
    ]
)
interface AppComponent {
    @Component.Factory
    interface Factory {
        fun create(coreComponent: CoreComponent): AppComponent
    }

    fun inject(fragment: LoginFragment)

    fun inject(fragment: DaftarFragment)

    fun inject(activity: DashboardActivity)
}