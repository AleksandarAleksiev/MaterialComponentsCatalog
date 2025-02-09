package com.aaleksiev.compose.material.components.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
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
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aaleksiev.compose.material.components.ui.ComponentItem

@Composable
internal fun Buttons(
    modifier: Modifier = Modifier,
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Adaptive(minSize = 150.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        item {
            ComponentItem(
                modifier = Modifier.fillMaxWidth(),
                componentName = "Filled Button"
            ) {
                Button(onClick = {}) { Text("Click me") }
            }
        }
        item {
            ComponentItem(
                modifier = Modifier.fillMaxWidth(),
                componentName = "Text Button"
            ) {
                TextButton(onClick = {}) { Text("Click me") }
            }
        }
        item {
            ComponentItem(
                modifier = Modifier.fillMaxWidth(),
                componentName = "Elevated Button"
            ) {
                ElevatedButton(onClick = {}) { Text("Click me") }
            }
        }
        item {
            ComponentItem(
                modifier = Modifier.fillMaxWidth(),
                componentName = "Tonal Button"
            ) {
                FilledTonalButton(onClick = {}) { Text("Click me") }
            }
        }
        item {
            ComponentItem(
                modifier = Modifier.fillMaxWidth(),
                componentName = "Outlined Button"
            ) {
                OutlinedButton(onClick = {}) { Text("Click me") }
            }
        }
        item {
            ComponentItem(
                modifier = Modifier.fillMaxWidth(),
                componentName = "Icon Button"
            ) {
                IconButton(onClick = {}) {
                    Icon(
                        imageVector = Icons.Rounded.Add,
                        contentDescription = null
                    )
                }
            }
        }
    }
}