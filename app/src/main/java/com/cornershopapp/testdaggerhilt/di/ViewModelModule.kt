package com.cornershopapp.testdaggerhilt.di

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cornershopapp.testdaggerhilt.di.annotation.ViewModelKey
import com.cornershopapp.testdaggerhilt.di.scope.ApplicationScope
import com.cornershopapp.testdaggerhilt.presentation.MainViewModel
import com.cornershopapp.testdaggerhilt.presentation.ViewModelFactory
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class ViewModelModule {

    @Binds
    @ApplicationScope
    abstract fun bindViewModelFactory(factory: ViewModelFactory): ViewModelProvider.Factory

    @Binds
    @IntoMap
    @ViewModelKey(MainViewModel::class)
    abstract fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}