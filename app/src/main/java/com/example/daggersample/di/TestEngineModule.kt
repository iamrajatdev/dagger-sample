package com.example.daggersample.di

import com.example.daggersample.sample.Engine
import com.example.daggersample.sample.TestEngine
import dagger.Module
import dagger.Provides

@Module
class TestEngineModule {

    @Provides
    fun getTestEngine(testEngine: TestEngine): Engine = testEngine

}