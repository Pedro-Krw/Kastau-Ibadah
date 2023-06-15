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
        "Yesaya 40:31",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.asatu
    ),
    KidsData(
        "Roma 8:28",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.adua
    ),
    KidsData(
        "Yeremia 29:11",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.atiga
    ),
    KidsData(
        "Filipi 4:13",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.aempat
    ),
    KidsData(
        "Yosua 1:9",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.alima
    ),
    KidsData(
        "Yohanes 1:1",
        4.0f,
        "All the Children in the word are cute and innocent for like this...",
        R.drawable.aenam
    )

)
