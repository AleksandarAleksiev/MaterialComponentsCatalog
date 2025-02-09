package com.aaleksiev.compose.material.components.ui.model

import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp

internal data class MaterialComponentsUiState(
    val surfaceElevation: Dp = 5.dp
)

internal sealed interface UserAction {
    data class UpdateSurfaceElevation(val surfaceElevation: Dp) : UserAction
}