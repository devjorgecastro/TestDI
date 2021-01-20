package com.cornershopapp.testdaggerhilt.di

import com.cornershopapp.testdaggerhilt.data.datasource.LocalDataSource
import com.cornershopapp.testdaggerhilt.data.repository.LocalDataRepository
import com.cornershopapp.testdaggerhilt.domain.usecase.GetData
import com.cornershopapp.testdaggerhilt.presentation.MainViewModel

object ViewModelInjector {
    fun provideMainViewModel() =
        MainViewModel.ViewModelFactory(UseCaseInjector.provideGetDataUseCase())
}

object UseCaseInjector {
    fun provideGetDataUseCase() =
        GetData(RepositoryInjector.provideDataRepository())
}

object RepositoryInjector {
    fun provideDataRepository() =
        LocalDataRepository(DatasourceInjector.provideDataSource())
}

object DatasourceInjector {
    fun provideDataSource() = LocalDataSource()
}