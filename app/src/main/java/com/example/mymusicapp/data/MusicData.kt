package com.example.mymusicapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class MusicData(
    val nameMusic: String,
    val artist: String,
    val duration: String,
    val imageMusic: String
) : Parcelable
