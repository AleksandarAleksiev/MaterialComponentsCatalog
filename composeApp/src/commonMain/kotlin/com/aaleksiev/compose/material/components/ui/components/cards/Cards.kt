package com.aaleksiev.compose.material.components.ui.components.cards

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.aaleksiev.compose.material.components.ui.model.Component
import com.aaleksiev.compose.material.components.ui.model.ComponentItem
import kotlinx.collections.immutable.persistentListOf

internal data object Cards : Component {
    override operator fun invoke() = persistentListOf(
        ComponentItem(
            name = "Card",
            content = {
                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "This is a regular Card",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        ),
        ComponentItem(
            name = "Elevated Card",
            content = {
                ElevatedCard(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "This is an Elevated Card",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        ),
        ComponentItem(
            name = "Outlined Card",
            content = {
                OutlinedCard(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Text(
                        text = "This is an Outlined Card",
                        modifier = Modifier.padding(16.dp)
                    )
                }
            }
        ),
        ComponentItem(
            name = "Card with custom content",
            content = {
                Card(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Title",
                        )
                        Text(
                            text = "Subtitle",
                        )
                    }
                }
            }
        ),
        ComponentItem(
            name = "Elevated Card with custom content",
            content = {
                ElevatedCard(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Title",
                        )
                        Text(
                            text = "Subtitle",
                        )
                    }
                }
            }
        ),
        ComponentItem(
            name = "Outlined Card with custom content",
            content = {
                OutlinedCard(
                    modifier = Modifier.fillMaxWidth()
                ) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = "Title",
                        )
                        Text(
                            text = "Subtitle",
                        )
                    }
                }
            }
        )
    )
}