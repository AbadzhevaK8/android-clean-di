package com.abadzheva.distart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun provideMonitor(): Monitor = Monitor()
}
