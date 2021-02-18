package com.example.daggersample.di

import javax.inject.Scope

/**
 * this is same as Singleton in android but customized which helps in getting single instance
 */
@Scope
@Retention(AnnotationRetention.RUNTIME)
annotation class ActivityScope