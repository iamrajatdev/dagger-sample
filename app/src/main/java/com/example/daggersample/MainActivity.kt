package com.example.daggersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.daggersample.di.CarComponent
import com.example.daggersample.di.DaggerCarComponent
import com.example.daggersample.di.TestEngineModule
import com.example.daggersample.sample.Car
import com.example.daggersample.sample.Engine
import com.example.daggersample.sample.Wheel
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    // Field injection
    @Inject
    lateinit var car: Car

    @Inject
    lateinit var engine: Engine

    @Inject
    lateinit var wheel: Wheel

    private lateinit var carComponent: CarComponent
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Creating dagger graph and injecting main activity because it is injected by android framework for which dagger cant inject this
        carComponent = (application as DaggerApplication).getCarComponent()
        carComponent.inject(this)
        car.drive()
        engine.startEngine()
        wheel.startWheel()
    }
}