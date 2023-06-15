package com.pacepdro.kastauibadah.android.screen.sublayout

import androidx.compose.foundation.BorderStroke
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
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Icon
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.constraintlayout.compose.ConstraintLayout
import com.pacepdro.kastauibadah.android.R


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AlamatPkb() {

    Card(
        modifier = Modifier
            .width(500.dp)
            .shadow(4.dp, shape = RoundedCornerShape(10.dp)), onClick = { /* Aksi yang ingin dilakukan saat card diklik */ }
    ) {

        ConstraintLayout(modifier = Modifier
            .padding(16.dp)
            .background(Color.White)) {
            val text1 = createRef()
            val text = createRef()
            val icon = createRef()
            Text(
                modifier = Modifier
                    .constrainAs(text1) {
                        top.linkTo(parent.top)
                    },
                text = "Ibadah Pkb", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(text) {
                        top.linkTo(text1.bottom, 8.dp)
                    },
                text = "Senin, 18 Agustus 2023")

            Icon(
                Icons.Default.ArrowForward,
                contentDescription = "More",
                tint = Color.Gray,
                modifier = Modifier
                    .clickable { /* Aksi yang ingin dilakukan saat ikon diklik */ }
                    .constrainAs(icon) {
                        start.linkTo(text.end, -20.dp)
                        top.linkTo(text1.bottom, 8.dp)
                    }
            )

        }
    }

    }
        



@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AlamatPw() {

    Card(
        modifier = Modifier
            .width(500.dp)
            .shadow(4.dp, shape = RoundedCornerShape(10.dp)), onClick = { /* Aksi yang ingin dilakukan saat card diklik */ }
    ) {
        ConstraintLayout(modifier = Modifier
            .padding(16.dp)
            .background(Color.White)) {
            val text1 = createRef()
            val text = createRef()
            val icon = createRef()
            Text(
                modifier = Modifier
                    .constrainAs(text1) {
                        top.linkTo(parent.top)
                    },
                text = "Ibadah Pw", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(text) {
                        top.linkTo(text1.bottom, 8.dp)
                    },
                text = "Selasa, 19 Agustus 2023")

            Icon(
                Icons.Default.ArrowForward,
                contentDescription = "More",
                tint = Color.Gray,
                modifier = Modifier
                    .clickable { /* Aksi yang ingin dilakukan saat ikon diklik */ }
                    .constrainAs(icon) {
                        start.linkTo(text.end, -20.dp)
                        top.linkTo(text1.bottom, 8.dp)
                    }
            )

        }
    }
    }





@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AlamatPam() {
    Card(
        modifier = Modifier
            .width(500.dp)
            .shadow(4.dp, shape = RoundedCornerShape(10.dp)), onClick = { /* Aksi yang ingin dilakukan saat card diklik */ }
    ) {
        ConstraintLayout(modifier = Modifier
            .padding(16.dp)
            .background(Color.White)) {
            val text1 = createRef()
            val text = createRef()
            val icon = createRef()
            Text(
                modifier = Modifier
                    .constrainAs(text1) {
                        top.linkTo(parent.top)
                    },
                text = "Ibadah Pam", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(text) {
                        top.linkTo(text1.bottom, 8.dp)
                    },
                text = "Rabu, 20 Agustus 2023")

            Icon(
                Icons.Default.ArrowForward,
                contentDescription = "More",
                tint = Color.Gray,
                modifier = Modifier
                    .clickable { /* Aksi yang ingin dilakukan saat ikon diklik */ }
                    .constrainAs(icon) {
                        start.linkTo(text.end, -20.dp)
                        top.linkTo(text1.bottom, 8.dp)
                    }
            )

        }
    }
    }


@OptIn(ExperimentalMaterialApi::class)
@Composable
fun AlamatPar() {

    Card(
        modifier = Modifier
            .width(500.dp)
            .shadow(4.dp, shape = RoundedCornerShape(10.dp)), onClick = { /* Aksi yang ingin dilakukan saat card diklik */ }
    ) {



        ConstraintLayout(modifier = Modifier
            .padding(16.dp)
            .background(Color.White)) {
            val text1 = createRef()
            val text = createRef()
            val icon = createRef()
            Text(
                modifier = Modifier
                    .constrainAs(text1) {
                        top.linkTo(parent.top)
                    },
                text = "Ibadah Par", style = TextStyle(fontSize = 15.sp, fontWeight = FontWeight.Bold))
            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .constrainAs(text) {
                        top.linkTo(text1.bottom, 8.dp)
                    },
                text = "kamis, 21 Agustus 2023")

            Icon(
                Icons.Default.ArrowForward,
                contentDescription = "More",
                tint = Color.Gray,
                modifier = Modifier
                    .clickable { /* Aksi yang ingin dilakukan saat ikon diklik */ }
                    .constrainAs(icon) {
                        start.linkTo(text.end, -20.dp)
                        top.linkTo(text1.bottom, 8.dp)
                    }
            )

        }
    }


// Batas
}



//Bagian Icon




//batas baian icon





@Preview(showBackground = true, showSystemUi = true)
@Composable
fun previewJadwal(){

}


