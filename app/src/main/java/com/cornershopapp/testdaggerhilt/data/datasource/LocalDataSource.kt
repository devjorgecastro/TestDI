package com.cornershopapp.testdaggerhilt.data.datasource

import javax.inject.Inject

class LocalDataSource @Inject constructor() : DataSource {
    override fun getData(): List<String> {
        return listOf(
            "Data 1",
            "Data 2",
            "Data 3",
            "Data 4",
            "Data 5",
        )
    }
}
