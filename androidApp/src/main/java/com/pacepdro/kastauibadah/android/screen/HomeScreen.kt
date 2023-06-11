package com.pacepdro.kastauibadah.android.screen

import android.graphics.Bitmap
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.BitmapDrawable
import android.graphics.drawable.Drawable
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.rememberImagePainter
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPam
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPar
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPkb
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPw
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch



@OptIn(ExperimentalMaterialApi::class)
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
            .height(250.dp)
            .constrainAs(comp1) {
                top.linkTo(parent.top)
            })
        {

            Greeting(name = String())
        }

        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp)
                .constrainAs(comp2) {
                    top.linkTo(comp1.bottom, 8.dp)
                },
            text = "Ibadah yang akan datang",
            style = TextStyle(fontSize = 18.sp, fontWeight = FontWeight.Bold)
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
@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier) {
        val images = listOf(
            "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEgSGR1Z1K7ATlubd3n-9792gEFrOLPHCOlValvi-SboJHpXb1_ikzHb4fDyaOqkNmrh2h9OrI_Qh7O2vupCnCZ2QcN57uIyENLydbeXEkb_ukL3WCfMWRybJxpwX4N6C1ekXgCDiY8lqzBLuz6xVI15G5rs-h_Y4e8V1wQeLuKo9Pcq5zQno9bTG9I/s1280/satu.png",
            "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEh2GRCMGLLK87KbuERmS2w69-Lsy8neoLSxEPWupY25A_ApigBzUyg3VVSZASicDw9yiEkdKGGZFlf1rRuDNVViyHRXAbM9zdCmm_t2g_P6JaymvpYdRe8QFtn9rMFRve1Vu39D7Eph7NpvmKfEgEC7A28urcbxt-lnFq-EdcML9Wc4-5UjG42Xqf4/s1280/dua.png",
            "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEjDHH_Rvu-WjL3f1jRqSLrA2HvTJESSpC-SDfHKL0PEMZ2ZQvVVWMhIVqHNTcqDw7f0pkjrgwQKubTkgYmjxTVv9goxfp8kA7odLWLzivekTuelFovUC9y8I9vhvnaoRn-OdU7m_skhe_XEfHykfTfd6dJhMChdD-o_aMOH5om5F4rjehiaQjEmBgU/s1288/tiga.png",
            "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiAOwN7GMorr-9geQVvEcOhalWjpHqZkTHc2SXIF2Z_FyU7IrTG8y05wnHtu4veO1n65pZ30u2cBEp3XtTizZgb0r_eRzo4nmLFfl4t5WQxvet87hKW6HBdanBjXvORPWOo6FdLoBG4KJDoRQiEZlNO6scogqsLULajqVP2Dny2mkltc_PgTSgxVhM/s1280/empat.png",
            "https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiKB4mig3ubxUwt66q6dUd39-m9VbPmTFMSvjKFWNEVt9r_qUR-Q66PGBEJHoCrFdYT1T1oQd3DSmjpeEf6O2-TE4u-A2uCuIC2nduRSGd3Tfl0JxNubR9BDtA7XqCll_NJxWdItp7Z8he9upIwaGoB3Fd6jQfKc64WNckodXzQvK_wjPqcXS2KUdg/s1280/ima.png")

        ImageSlider(images)
    }
}

fun Drawable.toBitmap(): Bitmap {
    if (this is BitmapDrawable) {
        return this.bitmap
    }
    val bitmap = Bitmap.createBitmap(
        intrinsicWidth.coerceAtLeast(1),
        intrinsicHeight.coerceAtLeast(1),
        Bitmap.Config.ARGB_8888
    )
    val canvas = Canvas(bitmap)
    setBounds(0, 0, canvas.width, canvas.height)
    draw(canvas)
    return bitmap
}


@Composable
fun NetworkImage(url: String, contentDescription: String?, width: Int, height: Int) {
    val painter: Painter = rememberImagePainter(url)
    Image(
        painter = painter,
        contentDescription = contentDescription,
        contentScale = ContentScale.Crop,
        modifier = Modifier
            .width(width.dp)
            .height(height.dp)
    )
}

@Composable
fun ImageSlider(images: List<Any>) {
    var currentImageIndex by remember { mutableStateOf(0) }
    var isAnimating by remember { mutableStateOf(false) }
    val coroutineScope = rememberCoroutineScope()

    Column(modifier = Modifier.fillMaxSize()) {

        Box(
            modifier = Modifier
                .weight(1f)
                .height(100.dp)
                .fillMaxWidth()
                .padding(16.dp)
        ) {
            // Scrollable Row of Cards
            LazyRow(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(16.dp)
            ) {
                itemsIndexed(images) { index, image ->
                    Card(
                        modifier = Modifier
                            .width(300.dp)
                            .height(200.dp)
                            .shadow(4.dp, shape = RoundedCornerShape(10.dp))
                            .clickable {
                                if (index != currentImageIndex && !isAnimating) {
                                    isAnimating = true
                                    coroutineScope.launch {
                                        val delayMillis = 500L
                                        // Wait for the card to change color before animating
                                        delay(delayMillis / 2)
                                        currentImageIndex = index
                                        delay(delayMillis)
                                        isAnimating = false
                                    }
                                }
                            },
                        elevation = 4.dp
                    ) {
                        NetworkImage(
                            contentDescription = "",
                            url = image as String,
                            width = 300,
                            height = 200
                        )
                    }
                }

            }

        }
        // Dots Indicator
//         Row(
//             modifier = Modifier
//                 .align(Alignment.CenterHorizontally)
//                 .padding(16.dp)
//         ) {
//             for (i in images.indices) {
//                 Surface(
//                     modifier = Modifier
//                         .size(10.dp)
//                         .padding(4.dp)
//                         .clip(CircleShape)
//                         .background(
//                             if (currentImageIndex == i) MaterialTheme.colors.primary
//                             else androidx.compose.ui.graphics.Color.LightGray
//                         )
//                         .clickable {
//                             if (i != currentImageIndex && !isAnimating) {
//                                 isAnimating = true
//                                 coroutineScope.launch {
//                                     val delayMillis = 500L
//                                     // Wait for the dot to change color before animating
//                                     delay(delayMillis / 2)
//                                     currentImageIndex = i
//                                     delay(delayMillis)
//                                     isAnimating = false
//                                 }
//                             }
//                         },
//                     color = androidx.compose.ui.graphics.Color.Transparent
//                 ) {
//
//                 }
//             }
//         }
//    }
    }
    // Automatic Image Slider
    LaunchedEffect(currentImageIndex) {
        while (true) {
            delay(5000L)
            if (!isAnimating) {
                val nextIndex = (currentImageIndex + 1) % images.size
                currentImageIndex = nextIndex
            }
        }
    }
}





// bagian Preview
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomePreview(){
    HomeLayout()
}
