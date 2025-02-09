package com.aaleksiev.compose.material.components.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aaleksiev.compose.material.components.ui.ComponentItem
import com.aaleksiev.compose.material.components.ui.model.ComponentItem

@Composable
internal fun ComponentDetails(
    modifier: Modifier = Modifier,
    items: List<ComponentItem>,
) {
    LazyVerticalGrid(
        modifier = modifier,
        columns = GridCells.Adaptive(minSize = 150.dp),
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 24.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),
        horizontalArrangement = Arrangement.spacedBy(8.dp)
    ) {
        items(items) { item ->
            ComponentItem(
                modifier = Modifier.fillMaxWidth(),
                componentName = item.name
            ) {
                item.content()
            }
        }
    }
}