package com.aaleksiev.compose.material.components.ui.model

import androidx.compose.runtime.Composable
import kotlinx.collections.immutable.ImmutableList

internal interface Component {
    operator fun invoke(): ImmutableList<ComponentItem>
}

data class ComponentItem(
    val name: String,
    val content: @Composable () -> Unit
)