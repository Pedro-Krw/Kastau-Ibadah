@file:OptIn(ExperimentalPagerApi::class)

package com.pacepdro.kastauibadah.android.screen


import android.graphics.PorterDuff
import android.widget.RatingBar
import androidx.compose.animation.core.tween
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.graphicsLayer
import androidx.compose.ui.graphics.lerp
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.util.lerp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import com.google.accompanist.pager.ExperimentalPagerApi
import com.google.accompanist.pager.HorizontalPager
import com.google.accompanist.pager.HorizontalPagerIndicator
import com.google.accompanist.pager.calculateCurrentOffsetForPage
import com.google.accompanist.pager.rememberPagerState
import com.pacepdro.kastauibadah.android.R
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPam
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPar
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPkb
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPw
import com.pacepdro.kastauibadah.android.view.ViewPagerSlider
import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import kotlin.math.absoluteValue



@OptIn(ExperimentalMaterialApi::class, ExperimentalPagerApi::class)
@Composable
fun HomeLayout(){

    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(androidx.compose.ui.graphics.Color.White)) {
        val comp1 = createRef()
        val comp2 = createRef()
        val comp3 = createRef()
        val comp4 = createRef()
        val comp5 = createRef()
        val comp6 = createRef()

        // Layout pagging

        Column(modifier = Modifier
            .fillMaxWidth()
            .height(280.dp)
            .constrainAs(comp1) {
                top.linkTo(parent.top)
            })
        {

//            ini BAGIAN TARUH IMAGE SLIDER
        ViewPagerSlider()

        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .constrainAs(comp2) {
                    top.linkTo(comp1.bottom, 8.dp)
                },
            text = "Ibadah yang akan datang",
            style = TextStyle(
                fontFamily = FontFamily.Serif,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold
            ),
        )



        Column(modifier = Modifier
            .padding(10.dp)
            .constrainAs(comp3) {
                top.linkTo(comp2.bottom)
            })
        {
            AlamatPkb()
            Spacer(modifier = Modifier .height(20.dp))
            AlamatPw()
            Spacer(modifier = Modifier .height(20.dp))
            AlamatPam()
            Spacer(modifier = Modifier .height(20.dp))
            AlamatPar()
        }



    }

}







// bagian Card List Utama

// bagian Preview
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomePreview(){
    HomeLayout()
}
