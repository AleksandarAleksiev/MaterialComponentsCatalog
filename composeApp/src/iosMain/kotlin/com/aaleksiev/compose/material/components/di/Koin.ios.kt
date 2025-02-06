package com.aaleksiev.compose.material.components.di

import org.koin.core.logger.Level
import org.koin.dsl.KoinConfiguration
import org.koin.dsl.koinConfiguration

internal actual val platformKonConfig: KoinConfiguration = koinConfiguration {
    printLogger(level = Level.DEBUG)
}