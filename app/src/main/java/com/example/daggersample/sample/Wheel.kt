package com.example.daggersample.sample

import javax.inject.Inject

/**
 * Suppose this is a class which we don't own it or a 3rd party library class and we cant annotate with @Inject
 */
class Wheel @Inject constructor(rim: Rim, tyres: Tyres) {

    fun startWheel() {
        println("Wheel started successfully")
    }

}