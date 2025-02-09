package com.aaleksiev.compose.material.components.ui

import androidx.lifecycle.ViewModel
import com.aaleksiev.compose.material.components.ui.model.MaterialComponentsUiState
import com.aaleksiev.compose.material.components.ui.model.UserAction
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

internal class MaterialComponentsViewModel : ViewModel() {
    private val _uiState = MutableStateFlow(MaterialComponentsUiState())
    val uiState: StateFlow<MaterialComponentsUiState> = _uiState.asStateFlow()

    fun handleUseAction(userAction: UserAction) {
        when (userAction) {
            is UserAction.UpdateSurfaceElevation -> {
                _uiState.update { currentState -> currentState.copy(surfaceElevation = userAction.surfaceElevation) }
            }
        }
    }
}