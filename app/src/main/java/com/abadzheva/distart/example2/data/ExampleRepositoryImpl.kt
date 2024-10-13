package com.abadzheva.distart.example2.data

import com.abadzheva.distart.example2.domain.ExampleRepository

class ExampleRepositoryImpl(
    private val localDataSource: ExampleLocalDataSource,
    private val remoteDataSource: ExampleRemoteDataSource
) : ExampleRepository {

    override fun method() {

    }
}
