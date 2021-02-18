package com.example.daggersample.di

import com.example.daggersample.Car
import com.example.daggersample.Engine
import com.example.daggersample.Wheel
import dagger.Module
import dagger.Provides

/**
 * When we don't own any class(3rd party or android framework) we create module to provide objects
 */
@Module
class CarModule {

    @Provides
    @ActivityScope
    fun getEngine(): Engine = Engine()

    @Provides
    @ActivityScope
    fun getWheel(): Wheel = Wheel()

    @Provides
    @ActivityScope
    fun getCar(engine: Engine, wheel: Wheel): Car = Car(engine, wheel)
}


