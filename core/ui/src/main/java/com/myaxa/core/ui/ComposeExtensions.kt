package com.myaxa.core.ui

import android.content.res.Configuration
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.myaxa.core.ui.theme.CryptocurrenciesListTheme

typealias ComposableFun = @Composable () -> Unit

@Composable
fun ThemedPreview(content: ComposableFun) {
    CryptocurrenciesListTheme {
        Surface { content() }
    }
}

@Preview(uiMode = Configuration.UI_MODE_NIGHT_YES, showBackground = true)
@Preview(uiMode = Configuration.UI_MODE_NIGHT_NO, showBackground = true)
annotation class DayNightPreview
