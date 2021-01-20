package com.cornershopapp.testdaggerhilt.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.cornershopapp.testdaggerhilt.domain.usecase.GetData
import javax.inject.Inject

class MainViewModel @Inject constructor(
    private val getDataUseCase: GetData
) : ViewModel() {

    val data = MutableLiveData<List<String>>()

    fun loadData() {
        data.value = getDataUseCase()
    }
}
