package com.aaleksiev.compose.material.components.di

import com.aaleksiev.compose.material.components.data.InMemoryMuseumStorage
import com.aaleksiev.compose.material.components.data.KtorMuseumApi
import com.aaleksiev.compose.material.components.data.MuseumApi
import com.aaleksiev.compose.material.components.data.MuseumRepository
import com.aaleksiev.compose.material.components.data.MuseumStorage
import com.aaleksiev.compose.material.components.screens.detail.DetailViewModel
import com.aaleksiev.compose.material.components.screens.list.ListViewModel
import io.ktor.client.HttpClient
import io.ktor.client.plugins.contentnegotiation.ContentNegotiation
import io.ktor.http.ContentType
import io.ktor.serialization.kotlinx.json.json
import kotlinx.serialization.json.Json
import org.koin.core.context.startKoin
import org.koin.core.module.dsl.factoryOf
import org.koin.dsl.KoinConfiguration
import org.koin.dsl.includes
import org.koin.dsl.koinConfiguration
import org.koin.dsl.module

internal val dataModule = module {
    single {
        val json = Json { ignoreUnknownKeys = true }
        HttpClient {
            install(ContentNegotiation) {
                // TODO Fix API so it serves application/json
                json(json, contentType = ContentType.Any)
            }
        }
    }

    single<MuseumApi> { KtorMuseumApi(get()) }
    single<MuseumStorage> { InMemoryMuseumStorage() }
    single {
        MuseumRepository(get(), get()).apply {
            initialize()
        }
    }
}

internal val viewModelModule = module {
    factoryOf(::ListViewModel)
    factoryOf(::DetailViewModel)
}

internal expect val platformKonConfig: KoinConfiguration

private val appModules = listOf(
    dataModule,
    viewModelModule,
)

internal val koinConfig = koinConfiguration {
    includes(platformKonConfig)
    modules(appModules)
}
