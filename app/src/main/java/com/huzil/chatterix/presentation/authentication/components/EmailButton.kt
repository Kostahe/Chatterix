package com.huzil.chatterix.presentation.authentication.components

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material3.Icon
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.huzil.chatterix.R
import com.huzil.chatterix.presentation.ui.theme.ChatterixTheme

@Composable
fun EmailSignInButton(
    modifier: Modifier = Modifier, onClick: () -> Unit
) {
    OutlinedButton(
        onClick = onClick, modifier = modifier
    ) {
        Icon(
            imageVector = Icons.Filled.Email,
            contentDescription = null,
            modifier = Modifier.size(dimensionResource(id = R.dimen.auth_button_image_size))
        )
        Spacer(modifier = Modifier.padding(horizontal = dimensionResource(id = R.dimen.email_button_pad_bet_child)))
        Text(
            text = stringResource(R.string.sign_in_with_email), color = if (isSystemInDarkTheme()) {
                Color.White
            } else {
                Color.Black
            }
        )
    }

}

@Preview(showBackground = true)
@Composable
private fun EmailSignInButtonPreview() {
    ChatterixTheme {
        EmailSignInButton(onClick = {})
    }
}