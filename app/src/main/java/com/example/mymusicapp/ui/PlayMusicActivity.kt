package com.example.mymusicapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.mymusicapp.data.MusicData
import com.example.mymusicapp.databinding.ActivityPlayMusicBinding
import com.bumptech.glide.Glide

class PlayMusicActivity : AppCompatActivity() {

    private lateinit var binding: ActivityPlayMusicBinding
    private var data: MusicData? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPlayMusicBinding.inflate(layoutInflater)
        setContentView(binding.root)

        data = intent.getParcelableExtra("stringData")

        binding.titleMusic.text = data?.nameMusic
        binding.tvArtistMusic.text = data?.artist
        binding.durationMusic.text = data?.duration

        // Load and display the image using Glide
        Glide.with(this)
            .load(data?.imageMusic)
            .into(binding.musicImg)
    }
}
