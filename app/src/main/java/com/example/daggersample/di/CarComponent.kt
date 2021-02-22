package com.example.daggersample.di

import com.example.daggersample.MainActivity
import dagger.Component

/**
 * Dependency graph objects
 */
@Component(modules = [WheelModule::class, PetrolEngineModule::class])
@ActivityScope
interface CarComponent {

    fun inject(mainActivity: MainActivity)
}