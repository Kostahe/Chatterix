package com.huzil.chatterix.presentation.authentication.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.huzil.chatterix.presentation.ui.theme.ChatterixTheme

@Composable
fun AuthenticationTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    imeAction: ImeAction,
    label: String,
) {
    TextField(
        value = value,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(imeAction = imeAction),
        label = {
            Text(
                text = label
            )
        },
        colors = TextFieldDefaults.colors(
            unfocusedIndicatorColor = MaterialTheme.colorScheme.surface,
            focusedIndicatorColor = MaterialTheme.colorScheme.surface,
            errorIndicatorColor = MaterialTheme.colorScheme.surface,
        ),
        shape = RoundedCornerShape(25),
        singleLine = true,
        modifier = modifier,
    )
}

@PreviewLightDark
@Preview(showBackground = true, name = "AuthenticationTextField")
@Composable
private fun PreviewAuthenticationTextField() {
    ChatterixTheme {
        var value by remember {
            mutableStateOf("Test")
        }

        AuthenticationTextField(
            value = value,
            onValueChange = { value = it },
            imeAction = ImeAction.Done,
            label = "Name"
        )
    }
}