package com.example.daggersample.di

import com.example.daggersample.sample.DieselEngine
import com.example.daggersample.sample.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {

    @Binds
    abstract fun getDieselEngine(dieselEngine: DieselEngine): Engine
}