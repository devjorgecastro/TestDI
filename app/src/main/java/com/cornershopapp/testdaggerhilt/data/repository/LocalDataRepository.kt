package com.cornershopapp.testdaggerhilt.data.repository

import com.cornershopapp.testdaggerhilt.data.datasource.DataSource
import com.cornershopapp.testdaggerhilt.domain.repository.DataRepository
import javax.inject.Inject

class LocalDataRepository @Inject constructor(
    private val dataSource: DataSource
) : DataRepository {
    override fun getData(): List<String> {
        return dataSource.getData()
    }
}
