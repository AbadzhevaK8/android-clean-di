package com.abadzheva.distart.example2.data.database

import android.util.Log
import javax.inject.Inject

class ExampleDatabase
    @Inject
    constructor() {
        fun method() {
            Log.d(LOG_TAG, "ExampleDatabase method")
        }

        companion object {
            private const val LOG_TAG = "EXAMPLE_TEST"
        }
    }
