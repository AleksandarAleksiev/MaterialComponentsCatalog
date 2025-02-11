package com.aaleksiev.compose.material.components.ui.components.textfields

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Add
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.OutlinedTextFieldDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import com.aaleksiev.compose.material.components.ui.model.Component
import com.aaleksiev.compose.material.components.ui.model.ComponentItem
import kotlinx.collections.immutable.persistentListOf

@OptIn(ExperimentalMaterial3Api::class)
internal data object TextInputs : Component {
    override operator fun invoke() = persistentListOf(
        ComponentItem(
            name = "TextField",
            content = {
                var text by remember { mutableStateOf("") }
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Enter text") },
                )
            }
        ),
        ComponentItem(
            name = "OutlinedTextField",
            content = {
                var text by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    label = { Text("Enter text") }
                )
            }
        ),
        ComponentItem(
            name = "TextField with Placeholder",
            content = {
                var text by remember { mutableStateOf("") }
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    placeholder = { Text("Placeholder text") },
                    label = { Text("Enter text") }
                )
            }
        ),
        ComponentItem(
            name = "OutlinedTextField with Placeholder",
            content = {
                var text by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    placeholder = { Text("Placeholder text") },
                    label = { Text("Enter text") }
                )
            }
        ),
        ComponentItem(
            name = "TextField with Leading Icon",
            content = {
                var text by remember { mutableStateOf("") }
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Email,
                            contentDescription = "Email"
                        )
                    },
                    label = { Text("Enter text") }
                )
            }
        ),
        ComponentItem(
            name = "OutlinedTextField with Leading Icon",
            content = {
                var text by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    leadingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Email,
                            contentDescription = "Email"
                        )
                    },
                    label = { Text("Enter text") }
                )
            }
        ),
        ComponentItem(
            name = "TextField with Trailing Icon",
            content = {
                var text by remember { mutableStateOf("") }
                TextField(
                    value = text,
                    onValueChange = { text = it },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Add,
                            contentDescription = "Add"
                        )
                    },
                    label = { Text("Enter text") }
                )
            }
        ),
        ComponentItem(
            name = "OutlinedTextField with Trailing Icon",
            content = {
                var text by remember { mutableStateOf("") }
                OutlinedTextField(
                    value = text,
                    onValueChange = { text = it },
                    trailingIcon = {
                        Icon(
                            imageVector = Icons.Rounded.Add,
                            contentDescription = "Add"
                        )
                    },
                    label = { Text("Enter text") }
                )
            }
        ),
        ComponentItem(
            name = "TextField with Error",
            content = {
                var text by remember { mutableStateOf("") }
                var isError by remember { mutableStateOf(text.length < 5) }
                TextField(
                    value = text,
                    onValueChange = {
                        text = it
                        isError = it.length < 5 // Example: Show error if less than 5 characters
                    },
                    isError = isError,
                    label = { Text("Enter at least 5 characters") },
                    supportingText = { if (isError) Text("Error: Need at least 5 characters") }
                )
            }
        ),
        ComponentItem(
            name = "OutlinedTextField with Error",
            content = {
                var text by remember { mutableStateOf("") }
                var isError by remember { mutableStateOf(text.length < 5) }
                OutlinedTextField(
                    value = text,
                    onValueChange = {
                        text = it
                        isError = it.length < 5 // Example: Show error if less than 5 characters
                    },
                    isError = isError,
                    label = { Text("Enter at least 5 characters") },
                    supportingText = { if (isError) Text("Error: Need at least 5 characters") }
                )
            }
        ),
        ComponentItem(
            name = "TextField Disabled",
            content = {
                var text by remember { mutableStateOf("This is disabled") }

                TextField(
                    value = text,
                    onValueChange = { },
                    enabled = false,
                    label = { Text("Disabled text") }
                )
            }
        ),
        ComponentItem(
            name = "OutlinedTextField Disabled",
            content = {
                var text by remember { mutableStateOf("This is disabled") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { },
                    enabled = false,
                    label = { Text("Disabled text") }
                )
            }
        ),
        ComponentItem(
            name = "TextField Uncolor",
            content = {
                var text by remember { mutableStateOf("This is uncolored") }

                TextField(
                    value = text,
                    onValueChange = { text=it},
                    colors = TextFieldDefaults.colors(
                        unfocusedIndicatorColor = Color.Transparent,
                        focusedIndicatorColor = Color.Transparent
                    ),
                    label = { Text("Uncolor") }
                )
            }
        ),
        ComponentItem(
            name = "OutlinedTextField Uncolor",
            content = {
                var text by remember { mutableStateOf("This is uncolored") }

                OutlinedTextField(
                    value = text,
                    onValueChange = { text=it},
                    colors = OutlinedTextFieldDefaults.colors(
                        unfocusedBorderColor = Color.Transparent,
                        focusedBorderColor = Color.Transparent
                    ),
                    label = { Text("Uncolor") }
                )
            }
        ),
    )
}