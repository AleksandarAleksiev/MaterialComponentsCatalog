package com.aaleksiev.compose.material.components

import android.app.Application

class MuseumApp : Application() {
    override fun onCreate() {
        super.onCreate()
        instance = this
    }

    companion object {
        lateinit var instance: MuseumApp
            private set
    }
}
