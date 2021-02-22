package com.example.daggersample.di

import com.example.daggersample.sample.Rim
import com.example.daggersample.sample.Tyres
import com.example.daggersample.sample.Wheel
import dagger.Module
import dagger.Provides

/**
 * When we don't own any class(3rd party or android framework) we create module to provide objects
 */
@Module
class WheelModule {

    @Provides
    @ActivityScope
    fun getRim(): Rim = Rim()

    @Provides
    @ActivityScope
    fun getTyres(): Tyres {
        val obj = Tyres()
        obj.tyre()
        return obj
    }

    @Provides
    @ActivityScope
    fun getWheel(rim: Rim, tyres: Tyres): Wheel = Wheel(rim, tyres)
}


