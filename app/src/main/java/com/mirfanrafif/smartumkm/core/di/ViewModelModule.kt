package com.mirfanrafif.smartumkm.core.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mirfanrafif.smartumkm.utils.ViewModelFactory
import com.mirfanrafif.smartumkm.view.viewmodel.DashboardViewModel
import com.mirfanrafif.smartumkm.view.viewmodel.LoginViewModel
import com.mirfanrafif.smartumkm.view.viewmodel.SmartLabaViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Suppress("unused")
@Module
abstract class ViewModelModule {
    @Binds
    @IntoMap
    @ViewModelKey(LoginViewModel::class)
    abstract fun bindLoginViewModel(viewModel: LoginViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(DashboardViewModel::class)
    abstract fun bindDashboardViewModel(viewModel: DashboardViewModel): ViewModel

    @Binds
    @IntoMap
    @ViewModelKey(SmartLabaViewModel::class)
    abstract fun bindSmartLabaViewModel(viewModel: SmartLabaViewModel): ViewModel

    @Binds
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory
}