package com.cornershopapp.testdaggerhilt.presentation

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cornershopapp.testdaggerhilt.domain.usecase.GetData
import dagger.hilt.android.scopes.ActivityRetainedScoped

@ActivityRetainedScoped
class MainViewModel @ViewModelInject constructor(
    private val getDataUseCase: GetData
) : ViewModel() {

    val data = MutableLiveData<List<String>>()

    fun loadData() {
        data.value = getDataUseCase()
    }
}
