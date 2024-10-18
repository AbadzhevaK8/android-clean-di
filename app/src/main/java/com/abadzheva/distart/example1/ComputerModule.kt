package com.abadzheva.distart.example1

import dagger.Module
import dagger.Provides

@Module
class ComputerModule {
    @Provides
    fun provideMonitor(): Monitor = Monitor()

    @Provides
    fun provideComputer(
        monitor: Monitor,
        computerTower: ComputerTower,
        keyboard: Keyboard,
        mouse: Mouse,
    ): Computer = Computer(monitor, computerTower, keyboard, mouse)
}
