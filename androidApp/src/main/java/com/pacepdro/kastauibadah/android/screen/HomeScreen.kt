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
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.rememberImagePainter
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch



@Composable
fun HomeLayout(){

    ConstraintLayout(modifier = Modifier .fillMaxSize() .background(androidx.compose.ui.graphics.Color.White)) {
        val comp1 = createRef()
        val comp2 = createRef()

        Card(modifier = Modifier
            .fillMaxWidth()
            .height(250.dp)
            .constrainAs(comp1) {
                top.linkTo(parent.top)
            })
        {
// Layout pagging
            Greeting(name = String())
        }

        
    }

}

// bagian Card List Utama
@Composable
fun Greeting(name: String) {
    Column(modifier = Modifier) {
        val images = listOf("https://media.npr.org/assets/img/2021/08/11/gettyimages-1279899488_wide-f3860ceb0ef19643c335cb34df3fa1de166e2761-s1100-c50.jpg",
            "https://cdn.pixabay.com/photo/2017/02/20/18/03/cat-2083492__480.jpg",
            "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcRrfPnodZbEjtJgE-67C-0W9pPXK8G9Ai6_Rw&usqp=CAU",
            "https://i.ytimg.com/vi/E9iP8jdtYZ0/maxresdefault.jpg",
            "https://cdn.shopify.com/s/files/1/0535/2738/0144/articles/shutterstock_149121098_360x.jpg")

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
