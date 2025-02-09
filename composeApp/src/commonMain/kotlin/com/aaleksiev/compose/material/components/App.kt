package com.aaleksiev.compose.material.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.aaleksiev.compose.material.components.di.koinConfig
import com.aaleksiev.compose.material.components.theme.AppTheme
import com.aaleksiev.compose.material.components.theme.LocalMaterialColor
import com.aaleksiev.compose.material.components.theme.MaterialColorScheme
import kotlinx.serialization.Serializable
import org.koin.compose.KoinApplication

@Serializable
object ListDestination

@Serializable
data class DetailDestination(val objectId: Int)

@Composable
fun App() {
    KoinApplication(application = koinConfig()) {
        AppTheme {
            Surface {
                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.Center
                ) {
                    val updateMaterialColor = LocalMaterialColor.current
                    Button(
                        onClick = {
                            updateMaterialColor.updateColor(
                                colorSchemeToken = MaterialColorScheme.Primary,
                                newColor = Color.Red
                            )
                        }
                    ) {
                        Text("Click me")
                    }
                }
            }
        }
    }
}
