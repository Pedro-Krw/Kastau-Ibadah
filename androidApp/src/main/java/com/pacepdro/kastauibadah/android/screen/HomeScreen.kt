package com.pacepdro.kastauibadah.android.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import androidx.constraintlayout.compose.Dimension
import com.pacepdro.kastauibadah.android.R


// Bagian ini berisi layout home yang diatur dengan constraint layout
@Composable
fun home(){

    ConstraintLayout(modifier = Modifier
        .fillMaxSize()
        .background(Color.White)) {
        val image = createRef()
        val text = createRef()
        val button = createRef()
        val box = createRef()
        val card = createRef()
        var images = listOf(
            R.drawable.gereja,
            R.drawable.gereja,
            R.drawable.gereja,

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            val images = listOf(
                R.drawable.gereja,
                R.drawable.gereja,
                R.drawable.gereja
            )
            ImageSlider(images)
        })

    }


}


// Bagian ini berisi layout utama

@Composable
fun ImageSlider(images: List<Int>) {
    ConstraintLayout(
        modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)
    ) {
        val (image) = createRefs()

        Image(
            painter = painterResource(images[0]),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(image) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    bottom.linkTo(parent.bottom)
                    width = Dimension.fillToConstraints
                    height = Dimension.fillToConstraints
                },
            contentScale = ContentScale.Crop
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewImageSlider() {
    val images = listOf(
        R.drawable.gereja,
        R.drawable.gereja,
        R.drawable.gereja
    )
    ImageSlider(images)
}

// Main Home layout

