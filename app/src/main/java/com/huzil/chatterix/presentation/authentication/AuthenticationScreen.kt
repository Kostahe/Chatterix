package com.huzil.chatterix.presentation.authentication

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.tooling.preview.PreviewParameter
import com.huzil.chatterix.R
import com.huzil.chatterix.presentation.authentication.components.EmailSignInButton
import com.huzil.chatterix.presentation.authentication.components.GoogleSignInButton
import com.huzil.chatterix.presentation.ui.theme.ChatterixTheme

@Composable
fun AuthenticationScreen(
    authenticationState: AuthenticationState,
    authenticationActions: AuthenticationActions
) {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(
                horizontal = dimensionResource(id = R.dimen.auth_screen_pad_horizontal),
                vertical = dimensionResource(id = R.dimen.auth_screen_pad_vertical)
            ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Icon(
            painter = painterResource(id = R.drawable.app_logo),
            contentDescription = stringResource(id = R.string.app_logo),
            modifier = Modifier.size(dimensionResource(id = R.dimen.auth_logo_size))
        )
        Spacer(modifier = Modifier.padding(bottom = dimensionResource(id = R.dimen.auth_logo_pad_bottom)))
        Text(
            text = stringResource(R.string.chat_authentication_title),
            style = MaterialTheme.typography.displaySmall
        )
        Text(
            text = stringResource(id = R.string.chat_authentication_subtitle),
            style = MaterialTheme.typography.titleSmall,
            color = MaterialTheme.colorScheme.onSurfaceVariant.copy(alpha = 0.8f)
        )
        EmailSignInButton(
            onClick = authenticationActions.onEmailSignInClick,
            modifier = Modifier.width(dimensionResource(id = R.dimen.auth_button_width))
        )
        GoogleSignInButton(
            onClick = authenticationActions.onGoogleSignInClick,
            modifier = Modifier.width(dimensionResource(id = R.dimen.auth_button_width))
        )
    }
}


@Preview(name = "authentication", showBackground = true)
@Composable
private fun AuthenticationScreenPreview(
    @PreviewParameter(AuthenticationStatePreviewParameterProvider::class)
    state: AuthenticationState
) {
    ChatterixTheme {
        AuthenticationScreen(
            authenticationState = state,
            authenticationActions = AuthenticationActions()
        )
}