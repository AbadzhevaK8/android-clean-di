package com.abadzheva.distart.example2.presentation

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.abadzheva.distart.R
import com.abadzheva.distart.example2.di.ContextModule
import com.abadzheva.distart.example2.di.DaggerApplicationComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var viewModel: ExampleViewModel

    private val component by lazy {
        DaggerApplicationComponent
            .builder()
            .contextModule(ContextModule(application))
            .build()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        component.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel.method()
    }
}
