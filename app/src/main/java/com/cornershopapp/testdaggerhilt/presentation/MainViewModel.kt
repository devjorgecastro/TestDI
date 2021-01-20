package com.cornershopapp.testdaggerhilt.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.cornershopapp.testdaggerhilt.domain.usecase.GetData

class MainViewModel(
    private val getDataUseCase: GetData
) : ViewModel() {

    val data = MutableLiveData<List<String>>()

    fun loadData() {
        data.value = getDataUseCase()
    }

    class ViewModelFactory(
        private val getDataUseCase: GetData
    ) : ViewModelProvider.NewInstanceFactory() {

        override fun <T : ViewModel?> create(modelClass: Class<T>) =
            MainViewModel(getDataUseCase) as T
    }
}
