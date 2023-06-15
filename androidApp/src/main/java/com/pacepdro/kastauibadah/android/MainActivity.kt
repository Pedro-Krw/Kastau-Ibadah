package com.pacepdro.kastauibadah.android

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.google.accompanist.pager.ExperimentalPagerApi
import com.pacepdro.kastauibadah.android.bottomnav.BottomNav
import com.pacepdro.kastauibadah.android.view.ViewPagerSlider

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalPagerApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApplicationTheme {
//              Call Function Main App Compose
                ViewPagerSlider()
            }
        }
    }
}

@Composable
fun GreetingView(text: String) {
    Text(text = text)
}

@OptIn(ExperimentalPagerApi::class)
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun DefaultPreview() {
    MyApplicationTheme {
        ViewPagerSlider()
    }
}
