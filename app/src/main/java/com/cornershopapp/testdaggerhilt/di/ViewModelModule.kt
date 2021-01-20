package com.cornershopapp.testdaggerhilt.di

import com.cornershopapp.testdaggerhilt.domain.usecase.GetData
import com.cornershopapp.testdaggerhilt.presentation.MainViewModel
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityRetainedComponent
import dagger.hilt.android.scopes.ActivityRetainedScoped

@Module
@InstallIn(ActivityRetainedComponent::class)
class ViewModelModule {

    @Provides
    @ActivityRetainedScoped
    fun counterUnitUpdateViewModel(getDataUseCase: GetData) = MainViewModel(getDataUseCase)
}
