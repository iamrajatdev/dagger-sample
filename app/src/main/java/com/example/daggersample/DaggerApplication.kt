package com.example.daggersample

import android.app.Application
import com.example.daggersample.di.CarComponent
import com.example.daggersample.di.DaggerCarComponent

/**
 * Creating application class in order to keep dagger component as single instance for whole application
 */
class DaggerApplication : Application() {

    private lateinit var carComponent: CarComponent

    override fun onCreate() {
        super.onCreate()
        carComponent = DaggerCarComponent.builder().getTestNum(3222).getTestSecondNum(123).bind()
    }

    // passing this as single instance method so that any application can call this to use car component
    fun getCarComponent(): CarComponent {
        return carComponent
    }
}