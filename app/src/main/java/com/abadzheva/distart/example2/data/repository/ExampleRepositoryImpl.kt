package com.abadzheva.distart.example2.data.repository

import com.abadzheva.distart.example2.data.datasource.ExampleLocalDataSource
import com.abadzheva.distart.example2.data.datasource.ExampleRemoteDataSource
import com.abadzheva.distart.example2.data.mapper.ExampleMapper
import com.abadzheva.distart.example2.di.ProdQualifier
import com.abadzheva.distart.example2.domain.ExampleRepository
import javax.inject.Inject

class ExampleRepositoryImpl
@Inject
constructor(
    private val localDataSource: ExampleLocalDataSource,
    @ProdQualifier private val remoteDataSource: ExampleRemoteDataSource,
    private val mapper: ExampleMapper,
) : ExampleRepository {
    override fun method() {
        mapper.map()
        localDataSource.method()
        remoteDataSource.method()
    }
}
