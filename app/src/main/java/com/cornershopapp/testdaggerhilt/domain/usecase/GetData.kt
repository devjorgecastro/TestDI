package com.cornershopapp.testdaggerhilt.domain.usecase

import com.cornershopapp.testdaggerhilt.domain.repository.DataRepository
import javax.inject.Inject

class GetData @Inject constructor(
    private val dataRepository: DataRepository
) {
    operator fun invoke(): List<String> {
        return dataRepository.getData()
    }
}
