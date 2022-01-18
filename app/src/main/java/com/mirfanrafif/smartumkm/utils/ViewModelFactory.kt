package com.mirfanrafif.smartumkm.utils

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mirfanrafif.smartumkm.core.di.AppScope
import java.lang.IllegalArgumentException
import javax.inject.Inject
import javax.inject.Provider

@Suppress("UNCHECKED_CAST")
@AppScope
class ViewModelFactory @Inject constructor(private val creators: Map<Class<out ViewModel>, @JvmSuppressWildcards Provider<ViewModel>>): ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        val creator = creators[modelClass] ?: creators.entries.firstOrNull {
            modelClass.isAssignableFrom(it.key)
        }?.value ?: throw IllegalArgumentException("Unknown model class $modelClass")
        return creator.get() as T
    }
}