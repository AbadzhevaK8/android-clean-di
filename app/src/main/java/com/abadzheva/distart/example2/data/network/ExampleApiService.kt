package com.abadzheva.distart.example2.data.network

import android.util.Log
import javax.inject.Inject

class ExampleApiService
    @Inject
    constructor() {
        fun method() {
            Log.d(LOG_TAG, "ExampleApiService method")
        }

        companion object {
            private const val LOG_TAG = "EXAMPLE_TEST"
        }
    }
