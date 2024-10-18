package com.abadzheva.distart.example2.presentation

import com.abadzheva.distart.example2.domain.ExampleUseCase

class ExampleViewModel(
    private val useCase: ExampleUseCase,
) {
    fun method() {
        useCase()
    }
}
