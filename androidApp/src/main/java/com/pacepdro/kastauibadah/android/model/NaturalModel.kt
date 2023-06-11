package com.pacepdro.kastauibadah.android.model

data class NaturalModel(
    val title: String,
    val rating: Float,
    val desc: String,
    val imgUrl: String
)


val natural = listOf(
    NaturalModel(
        "Sample 1",
        4.0f,
        "Decription Sample 1",
        ""
    ),
    NaturalModel(
        "Sample 2",
        4.5f,
        "Decription Sample 2",
        ""
    ),
    NaturalModel(
        "Sample 3",
        5.0f,
        "Decription Sample 3",
        ""
    ),
    NaturalModel(
        "Sample 4",
        3.5f,
        "Decription Sample 4",
        ""
    ),
    NaturalModel(
        "Sample 5",
        2.0f,
        "Decription Sample 5",
        ""
    )
)
