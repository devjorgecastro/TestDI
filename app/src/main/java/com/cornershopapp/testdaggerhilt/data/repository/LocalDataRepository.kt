package com.cornershopapp.testdaggerhilt.data.repository

import com.cornershopapp.testdaggerhilt.data.datasource.DataSource
import com.cornershopapp.testdaggerhilt.domain.repository.DataRepository

class LocalDataRepository(
    private val dataSource: DataSource
) : DataRepository {
    override fun getData(): List<String> {
        return dataSource.getData()
    }
}
