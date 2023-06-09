package com.pacepdro.kastauibadah.android.screen


import android.annotation.SuppressLint
import android.os.Bundle
import android.webkit.CookieManager
import android.webkit.JavascriptInterface
import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import android.webkit.WebViewClient
import android.webkit.WebChromeClient
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@SuppressLint("JavascriptInterface")
@Composable
fun AlkitabWebView() {
    val context = LocalContext.current

    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (webView) = createRefs()

        val webViewState = remember { mutableStateOf(WebState()) }

        AndroidView(
            factory = {
                WebView(context).apply {
                    // Nonaktifkan manajemen cookies
                    val cookieManager = CookieManager.getInstance()
                    cookieManager.setAcceptCookie(false)
                    cookieManager.setAcceptThirdPartyCookies(this, false)

                    // Konfigurasi WebView jika diperlukan
                    settings.apply {
                        // ...
                    }

                    webViewClient = object : WebViewClient() {
                        override fun shouldOverrideUrlLoading(view: WebView?, url: String?): Boolean {
                            // Load semua URL di dalam WebView
                            return false
                        }
                    }

                    webChromeClient = object : WebChromeClient() {
                        // Konfigurasi tambahan jika diperlukan
                    }

                    addJavascriptInterface(WebAppInterface(), "Android")

                    if (webViewState.value.url == null) {
                        loadUrl("https://alkitab.mobi/")
                    } else {
                        webViewState.value.bundle?.let { it1 -> restoreState(it1) }
                    }
                }
            },
            modifier = Modifier.constrainAs(webView) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            }
        )

//        Bagian DisposableEffect
        DisposableEffect(key1 = webViewState) {
            onDispose {
                webViewState.value.bundle = Bundle().apply {
                    webView
                }
            }
        }
    }
}

data class WebState(
    var url: String? = null,
    var bundle: Bundle? = null
)

class WebAppInterface {
    @JavascriptInterface
    fun sendDataToApp(data: String) {
        // Meng-handle data yang diterima dari web
        // ...
    }

    // Method lainnya jika diperlukan
}


@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview(){
    AlkitabWebView()
}