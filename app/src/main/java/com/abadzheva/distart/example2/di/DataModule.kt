package com.abadzheva.distart.example2.di

import com.abadzheva.distart.example2.data.datasource.ExampleLocalDataSource
import com.abadzheva.distart.example2.data.datasource.ExampleLocalDataSourceImpl
import com.abadzheva.distart.example2.data.datasource.ExampleRemoteDataSource
import com.abadzheva.distart.example2.data.datasource.ExampleRemoteDataSourceImpl
import dagger.Binds
import dagger.Module

@Module
interface DataModule {
    @Binds
    fun bindLocalDataSource(impl: ExampleLocalDataSourceImpl): ExampleLocalDataSource

    @Binds
    fun bindRemoteDataSource(impl: ExampleRemoteDataSourceImpl): ExampleRemoteDataSource
}
