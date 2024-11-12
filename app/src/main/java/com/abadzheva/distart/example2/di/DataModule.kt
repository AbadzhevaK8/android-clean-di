package com.abadzheva.distart.example2.di

import com.abadzheva.distart.example2.data.datasource.ExampleLocalDataSource
import com.abadzheva.distart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.abadzheva.distart.example2.data.datasource.ExampleRemoteDataSource
import com.abadzheva.distart.example2.data.datasource.ExampleRemoteDataSourceImpl
import com.abadzheva.distart.example2.data.datasource.TestRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @ApplicationScope
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @ProdQualifier
    @ApplicationScope
    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource

    @TestQualifier
    @ApplicationScope
    @Binds
    fun bindTestRemoteDataSource(impl: TestRemoteDataSourceImpl): ExampleRemoteDataSource
}
