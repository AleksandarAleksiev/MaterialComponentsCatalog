package com.aaleksiev.compose.material.components.ui.components.buttons

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material3.Button
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import com.aaleksiev.compose.material.components.ui.model.Component
import com.aaleksiev.compose.material.components.ui.model.ComponentItem
import kotlinx.collections.immutable.persistentListOf

data object Buttons : Component {
    override operator fun invoke() = persistentListOf(
        ComponentItem(
            name = "Filled Button",
            content = { Button(onClick = {}) { Text("Click me") } }
        ),
        ComponentItem(
            name = "Text Button",
            content = { TextButton(onClick = {}) { Text("Click me") } }
        ),
        ComponentItem(
            name = "Elevated Button",
            content = { ElevatedButton(onClick = {}) { Text("Click me") } }
        ),
        ComponentItem(
            name = "Tonal Button"
        ) {
            FilledTonalButton(onClick = {}) { Text("Click me") }
        },
        ComponentItem(
            name = "Outlined Button",
            content = { OutlinedButton(onClick = {}) { Text("Click me") } }
        ),
        ComponentItem(
            name = "Icon Button",
            content = {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Rounded.Add,
                        contentDescription = null
                    )
                }
            }
        ),
    )
}