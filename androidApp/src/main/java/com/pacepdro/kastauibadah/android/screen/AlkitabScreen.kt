package com.pacepdro.kastauibadah.android.screen


import android.webkit.WebView
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import android.webkit.WebViewClient
import android.webkit.WebResourceRequest
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun AlkitabScreen(){

    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {

        val text = createRef()
        val alkitab = createRef()
        
        Card (modifier = Modifier
            .fillMaxWidth()
            .height(800.dp)
            .padding(10.dp)
            .shadow(8.dp, shape = RoundedCornerShape(15.dp))
            .constrainAs(alkitab) {
                bottom.linkTo(parent.top)
            }){
            WebViewComponent(url = "https://alkitab.me/" )

        }

    }

}


@Composable
fun WebViewComponent(url: String) {
    AndroidView(
        modifier = Modifier.fillMaxSize(),
        factory = { context ->
            val webView = WebView(context)
            webView.settings.javaScriptEnabled = true
            webView.settings.domStorageEnabled = true
            webView.webViewClient = MyWebViewClient()
            webView.loadUrl("https://alkitab.me/")
            webView
        }
    )
}

class MyWebViewClient : WebViewClient() {
    override fun shouldOverrideUrlLoading(view: WebView, request: WebResourceRequest): Boolean {
        view.loadUrl(request.url.toString())
        return true
    }
}
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun Preview(){
    AlkitabScreen()
}