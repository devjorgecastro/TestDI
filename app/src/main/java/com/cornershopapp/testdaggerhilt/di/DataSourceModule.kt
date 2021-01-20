package com.cornershopapp.testdaggerhilt.di

import com.cornershopapp.testdaggerhilt.data.datasource.DataSource
import com.cornershopapp.testdaggerhilt.data.datasource.LocalDataSource
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class DataSourceModule {
    @Binds
    abstract fun bindLocalDataSource(datasource: LocalDataSource): DataSource
}
