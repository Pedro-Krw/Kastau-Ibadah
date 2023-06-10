package com.pacepdro.kastauibadah.android.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
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

        Column(
            modifier = Modifier.fillMaxSize()
        ) {
            Text(text = "Home Screen", fontSize = 20.sp)
        }

    }


}


// Bagian ini berisi layout utama


@Composable
fun HomeScreen() {
    ConstraintLayout(modifier = Modifier.fillMaxSize()) {
        val (backgroundImage, card1, card2, card3, card4) = createRefs()

        Image(
            painter = painterResource(R.drawable.home),
            contentDescription = null,
            modifier = Modifier
                .constrainAs(backgroundImage) {
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                }
                .fillMaxWidth()
                .height(200.dp),
            contentScale = ContentScale.Crop
        )

        CardItem(
            title = "Card 1",
            description = "This is Card 1 description",
            backgroundColor = Color(0xFFE57373),
            imageRes = R.drawable.home,
            modifier = Modifier.constrainAs(card1) {
                top.linkTo(backgroundImage.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        CardItem(
            title = "Card 2",
            description = "This is Card 2 description",
            backgroundColor = Color(0xFF81C784),
            imageRes = R.drawable.home,
            modifier = Modifier.constrainAs(card2) {
                top.linkTo(card1.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        CardItem(
            title = "Card 3",
            description = "This is Card 3 description",
            backgroundColor = Color(0xFF64B5F6),
            imageRes = R.drawable.home,
            modifier = Modifier.constrainAs(card3) {
                top.linkTo(card2.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )

        CardItem(
            title = "Card 4",
            description = "This is Card 4 description",
            backgroundColor = Color(0xFFFFB74D),
            imageRes = R.drawable.home,
            modifier = Modifier.constrainAs(card4) {
                top.linkTo(card3.bottom, margin = 16.dp)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
            }
        )
    }
}

@Composable
fun CardItem(
    title: String,
    description: String,
    backgroundColor: Color,
    imageRes: Int,
    modifier: Modifier = Modifier
) {
    Card(
        modifier = modifier
            .fillMaxWidth()
            .height(120.dp),
        backgroundColor = backgroundColor,
        elevation = 4.dp
    ) {
        Row(modifier = Modifier.fillMaxSize()) {
            Image(
                painter = painterResource(imageRes),
                contentDescription = null,
                modifier = Modifier
                    .width(120.dp)
                    .fillMaxHeight(),
                contentScale = ContentScale.Crop
            )

            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .padding(16.dp),
                verticalArrangement = Arrangement.Center
            ) {
                Text(
                    text = title,
                    style = MaterialTheme.typography.h6,
                    color = Color.White
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = description,
                    style = MaterialTheme.typography.body1,
                    color = Color.White
                )
            }
        }
    }
}


// Bagian preview
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun homePreciew(){
       HomeScreen()
}



// Main Home layout

