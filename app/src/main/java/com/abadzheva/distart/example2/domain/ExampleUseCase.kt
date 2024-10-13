package com.abadzheva.distart.example2.domain

import com.abadzheva.distart.example2.domain.ExampleRepository

class ExampleUseCase(
    private val repository: ExampleRepository
) {

    operator fun invoke() {

    }
}
