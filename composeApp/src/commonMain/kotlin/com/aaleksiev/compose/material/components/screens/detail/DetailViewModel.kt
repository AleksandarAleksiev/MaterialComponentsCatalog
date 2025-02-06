package com.aaleksiev.compose.material.components.screens.detail

import androidx.lifecycle.ViewModel
import com.aaleksiev.compose.material.components.data.MuseumObject
import com.aaleksiev.compose.material.components.data.MuseumRepository
import kotlinx.coroutines.flow.Flow

class DetailViewModel(private val museumRepository: MuseumRepository) : ViewModel() {
    fun getObject(objectId: Int): Flow<MuseumObject?> =
        museumRepository.getObjectById(objectId)
}
