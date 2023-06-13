package com.pacepdro.kastauibadah.android.screen

import android.view.View
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import androidx.constraintlayout.compose.ConstraintLayout
import coil.compose.rememberImagePainter
import com.denzcoskun.imageslider.models.SlideModel
import com.pacepdro.kastauibadah.android.R
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPam
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPar
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPkb
import com.pacepdro.kastauibadah.android.screen.sublayout.AlamatPw


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

//            ini BAGIAN TARUH IMAGE SLIDER
            ImageSlider(imageList = listOf(
                SlideModel("https://bit.ly/2YoJ77H", "The animal population decreased by 58 percent in 42 years."),
                SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct."),
                SlideModel("https://bit.ly/3fLJf72", "And people do that.")))
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


@Composable
fun ImageSlider(imageList: List<SlideModel>) {

    AndroidView(factory = {
        View.inflate(it, R.layout.image_slider, null)
    })

    var imageList = listOf(
        SlideModel("https://bit.ly/2YoJ77H", "The animal population decreased by 58 percent in 42 years."),
        SlideModel("https://bit.ly/2BteuF2", "Elephants and tigers may become extinct."),
        SlideModel("https://bit.ly/3fLJf72", "And people do that.")
    )

    ImageSlider(imageList)

    var currentItem by remember { mutableStateOf(0) }

    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            painter = rememberImagePainter(data = imageList[currentItem].imageUrl),
            contentDescription = imageList[currentItem].title,
            contentScale = ContentScale.FillBounds,
            modifier = Modifier.fillMaxSize()
        )

        IconButton(
            onClick = { currentItem = (currentItem + 1) % imageList.size },
            modifier = Modifier.align(Alignment.CenterEnd)
        ) {
            Icon(
                imageVector = Icons.Default.ArrowForward,
                contentDescription = "Next Image",
                tint = androidx.compose.ui.graphics.Color.White
            )
        }
    }



// batas akhir
}




// bagian Card List Utama

// bagian Preview
@Preview(showSystemUi = true, showBackground = true)
@Composable
fun HomePreview(){
    HomeLayout()
}
