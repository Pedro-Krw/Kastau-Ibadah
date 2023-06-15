package com.pacepdro.kastauibadah.android.model

import com.pacepdro.kastauibadah.android.R

data class KidsData(

    val title :String,
    val rating : Float,
    val desc :String,
    val imgUri:Int
)

/**
 * create Kids List
 * */

val kidsList = listOf(
    KidsData(
        "Sitting Pretty",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.gereja
    ),
    KidsData(
        "Love her Expression",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.gereja
    ),
    KidsData(
        "Childhood Superman",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.home
    ),
    KidsData(
        "Candle Night At Marina",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.person
    ),
    KidsData(
        "Girl with Beautiful smile",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.gereja
    ),
    KidsData(
        "Bath Time",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.gereja
    )

)
