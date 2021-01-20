package com.cornershopapp.testdaggerhilt.di

import com.cornershopapp.testdaggerhilt.data.repository.LocalDataRepository
import com.cornershopapp.testdaggerhilt.domain.repository.DataRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent

@Module
@InstallIn(ActivityRetainedComponent::class)
abstract class RepositoryModule {
    @Binds
    abstract fun bindLocalDataRepository(repository: LocalDataRepository): DataRepository
}


