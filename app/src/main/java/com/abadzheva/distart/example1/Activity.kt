package com.abadzheva.distart.example1

import javax.inject.Inject

class Activity {
    //    val component = DaggerNewComponent.create()
    @Inject
    lateinit var computer: Computer

    init {
        DaggerNewComponent.create().inject(this)
    }
}
