package com.pacepdro.kastauibadah.android.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.constraintlayout.compose.ConstraintLayout

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

        Text(text = "Kastau Ibadah")

    }


}


// Bagian ini berisi layout dari bottom app bar
@Composable
fun BottomBar(){
        BottomAppBar() {
            
        }
}


// Bagian preview
@Preview(showBackground = true, showSystemUi = true)
@Composable
fun homePreciew(){
        home()
}