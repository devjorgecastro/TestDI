package com.cornershopapp.testdaggerhilt.di

import com.cornershopapp.testdaggerhilt.data.datasource.DataSource
import com.cornershopapp.testdaggerhilt.data.datasource.LocalDataSource
import dagger.Binds
import dagger.Module

@Module
abstract class DataSourceModule {

    @Binds
    abstract fun bindLocalDataSource(localDataSource: LocalDataSource): DataSource
}
