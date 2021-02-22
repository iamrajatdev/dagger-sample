package com.example.daggersample.di

import com.example.daggersample.sample.Engine
import com.example.daggersample.sample.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {

    @Binds
    abstract fun getPetrolEngine(petrolEngine: PetrolEngine): Engine
}