package com.huzil.chatapp.presentation.components

import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Visibility
import androidx.compose.material.icons.filled.VisibilityOff
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalFocusManager
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewLightDark
import com.huzil.chatterix.R

@Composable
fun AuthenticationPasswordTextField(
    modifier: Modifier = Modifier,
    value: String,
    onValueChange: (String) -> Unit,
    imeAction: ImeAction,
    label: String,
) {
    var passwordVisible by rememberSaveable {
        mutableStateOf(false)
    }
    val focusManager = LocalFocusManager.current

    TextField(
        value = value,
        onValueChange = onValueChange,
        keyboardOptions = KeyboardOptions(
            imeAction = imeAction, keyboardType = KeyboardType.Password
        ),
        visualTransformation = if (passwordVisible) VisualTransformation.None else PasswordVisualTransformation(),
        keyboardActions = KeyboardActions(onDone = { focusManager.clearFocus() }),
        label = {
            Text(
                text = label,
            )
        },
        singleLine = true,
        colors = TextFieldDefaults.colors(
            unfocusedIndicatorColor = MaterialTheme.colorScheme.surface,
            focusedIndicatorColor = MaterialTheme.colorScheme.surface,
            errorIndicatorColor = MaterialTheme.colorScheme.surface,
        ),
        trailingIcon = {
            if (passwordVisible) {
                IconButton(onClick = { passwordVisible = false }) {
                    Icon(
                        imageVector = Icons.Filled.Visibility,
                        contentDescription = stringResource(R.string.password_visible),
                    )
                }
            } else {
                IconButton(onClick = { passwordVisible = true }) {
                    Icon(
                        imageVector = Icons.Filled.VisibilityOff,
                        contentDescription = stringResource(R.string.password_invisible),
                    )
                }
            }
        },
        shape = RoundedCornerShape(25),
        modifier = modifier
    )
}

@PreviewLightDark
@Preview(showBackground = true, name = "AuthenticationPasswordTextField")
@Composable
private fun PreviewAuthenticationPasswordTextField() {
    var value by remember {
        mutableStateOf("Test")
    }

    AuthenticationPasswordTextField(
        value = value,
        onValueChange = { value = it },
        imeAction = ImeAction.Done,
        label = "Password"
    )
}