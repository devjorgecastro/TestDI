package com.cornershopapp.testdaggerhilt.domain.usecase

import com.cornershopapp.testdaggerhilt.domain.repository.DataRepository

class GetData(
    private val dataRepository: DataRepository
) {
    operator fun invoke(): List<String> {
        return dataRepository.getData()
    }
}
