package com.example.daggersample.di

import com.example.daggersample.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Named

/**
 * Dependency graph objects
 */
@Component(modules = [WheelModule::class, TestEngineModule::class])
@ActivityScope
interface CarComponent {

    fun inject(mainActivity: MainActivity)

    @Component.Builder
    interface Builder {
        fun bind(): CarComponent

        @BindsInstance
        fun getTestNum(@Named("numOfTests") testNum: Int): Builder

        @BindsInstance
        fun getTestSecondNum(@Named("numOfSecondTest") testSecondNum: Int): Builder
    }
}