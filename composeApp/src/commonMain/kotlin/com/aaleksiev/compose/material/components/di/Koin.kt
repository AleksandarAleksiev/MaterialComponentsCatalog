package com.aaleksiev.compose.material.components.di

import org.koin.dsl.KoinConfiguration
import org.koin.dsl.includes
import org.koin.dsl.koinConfiguration
import org.koin.dsl.module

internal val viewModelModule = module {
}

internal expect val platformKonConfig: KoinConfiguration

private val appModules = listOf(
    viewModelModule,
)

internal val koinConfig = koinConfiguration {
    includes(platformKonConfig)
    modules(appModules)
}
