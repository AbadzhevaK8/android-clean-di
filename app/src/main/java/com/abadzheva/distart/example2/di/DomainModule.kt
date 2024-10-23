package com.abadzheva.distart.example2.di

import com.abadzheva.distart.example2.data.repository.ExampleRepositoryImpl
import com.abadzheva.distart.example2.domain.ExampleRepository
import dagger.Binds
import dagger.Module

@Module
interface DomainModule {
    @Binds
    fun bindRepository(impl: ExampleRepositoryImpl): ExampleRepository
}
