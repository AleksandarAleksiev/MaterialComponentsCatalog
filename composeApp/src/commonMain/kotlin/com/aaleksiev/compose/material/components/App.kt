package com.aaleksiev.compose.material.components

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Layers
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.aaleksiev.compose.material.components.di.koinConfig
import com.aaleksiev.compose.material.components.theme.AppTheme
import com.aaleksiev.compose.material.components.ui.MaterialComponentsViewModel
import com.aaleksiev.compose.material.components.ui.components.ComponentDetails
import com.aaleksiev.compose.material.components.ui.components.textfields.TextInputs
import kotlinx.serialization.Serializable
import org.koin.compose.KoinApplication
import org.koin.compose.viewmodel.koinViewModel

@Serializable
object ListDestination

@Serializable
data class DetailDestination(val objectId: Int)

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun App() {
    KoinApplication(application = koinConfig()) {
        val materialComponentsViewModel: MaterialComponentsViewModel = koinViewModel()
        AppTheme {
            val uiState by materialComponentsViewModel.uiState.collectAsStateWithLifecycle()
            Surface(
                tonalElevation = uiState.surfaceElevation,
            ) {
                Scaffold(
                    modifier = Modifier.fillMaxSize(),
                    topBar = {
                        TopAppBar(
                            modifier = Modifier.fillMaxWidth(),
                            title = { Text("M3 Components") },
                            actions = {
                                IconButton(
                                    onClick = {
                                    },
                                    modifier = Modifier.align(Alignment.CenterVertically)
                                ) {
                                    Icon(
                                        imageVector = Icons.Rounded.Layers,
                                        contentDescription = null
                                    )
                                }
                            },
                        )
                    },
                ) { innerPadding ->
                    ComponentDetails(
                        modifier = Modifier
                            .fillMaxSize()
                            .padding(innerPadding),
                        items = TextInputs()
                    )
                }
            }
        }
    }
}
