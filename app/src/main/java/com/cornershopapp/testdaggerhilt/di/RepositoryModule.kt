package com.cornershopapp.testdaggerhilt.di

import com.cornershopapp.testdaggerhilt.data.repository.LocalDataRepository
import com.cornershopapp.testdaggerhilt.domain.repository.DataRepository
import dagger.Binds
import dagger.Module

@Module
abstract class RepositoryModule {

    @Binds
    abstract fun bindLocalDataRepository(localDataRepository: LocalDataRepository): DataRepository
}
