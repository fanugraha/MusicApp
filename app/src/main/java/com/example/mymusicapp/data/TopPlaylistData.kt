package com.example.mymusicapp.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class TopPlaylistData(
    val imagePlaylist: String,
    val namePlaylist: String,
    val descPlaylis: String
) : Parcelable
