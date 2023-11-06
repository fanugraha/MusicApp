package com.example.mymusicapp.ui

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.mymusicapp.R
import com.example.mymusicapp.adapter.MyMusicAdapter
import com.example.mymusicapp.data.MusicData
import com.example.mymusicapp.databinding.FragmentHomeBinding

class HomeFragment : Fragment() {


    private lateinit var binding: FragmentHomeBinding
    private val musicList = arrayListOf(
        MusicData(
            "Stay",
            "The Kid LAROI & Justin Bieber",
            "2:25",
            "https://charts-static.billboard.com/img/2022/10/taylor-swift-824-antihero-fgo-344x344.jpg"
        ),
        MusicData(
            "Industry Baby",
            "Lil Nas X & Jack Harlow",
            "3:03",
            "https://charts-static.billboard.com/img/2022/10/sam-smith-jw8-unholy-7a7-344x344.jpg"
        ),
        MusicData(
            "Bad Habits",
            "Ed Sheeran",
            "3:51",
            "https://charts-static.billboard.com/img/2022/09/david-guetta-ruw-imgoodblue-d17-344x344.jpg"
        ),
        MusicData(
            "Montero (Call Me By Your Name)",
            "Lil Nas X",
            "2:17",
            "https://charts-static.billboard.com/img/2013/08/metro-boomin-nxb-344x344.jpg"
        ),
        MusicData(
            "Peaches",
            "Justin Bieber",
            "3:18",
            "https://charts-static.billboard.com/img/2016/12/the-weeknd-jlk-dieforyou-ix0-344x344.jpg"
        ),
        MusicData(
            "Kiss Me More",
            "Doja Cat featuring SZA",
            "3:23",
            "https://charts-static.billboard.com/img/2009/04/drake-04g-344x344.jpg"
        ),
        MusicData(
            "Fancy Like",
            "Walker Hayes",
            "2:44",
            "https://charts-static.billboard.com/img/2022/04/harry-styles-6jk-asitwas-po3-344x344.jpg"
        ),
        MusicData(
            "Save Your Tears",
            "The Weeknd",
            "3:35",
            "https://charts-static.billboard.com/img/2022/07/steve-lacy-d2o-badhabit-l6b-344x344.jpg"
        ),
        MusicData(
            "Blinding Lights",
            "The Weeknd",
            "3:20",
            "https://charts-static.billboard.com/img/2022/05/zachbryan-de1-somethingintheorange-ynj-344x344.jpg"
        ),
        MusicData(
            "Butter",
            "BTS",
            "2:45",
            "https://charts-static.billboard.com/img/2022/10/lil-uzi-vert-g7z-justwannarock-uyx-344x344.jpg"
        ),
        MusicData(
            "Good 4 U",
            "Olivia Rodrigo",
            "2:58",
            "https://charts-static.billboard.com/img/2022/09/jvke-4lr-goldenhour-ig9-344x344.jpg"
        ),
        MusicData(
            "Deja Vu",
            "Olivia Rodrigo",
            "3:35",
            "https://charts-static.billboard.com/img/2022/08/chris-brown-94g-undertheinfluence-oac-344x344.jpg"
        ),
        MusicData(
            "Monsters",
            "Sa-Va",
            "3:12",
            "https://charts-static.billboard.com/img/2022/08/beyonce-0na-cuffit-sb9-344x344.jpg"
        ),
        MusicData(
            "Levitating",
            "Dua Lipa",
            "3:23",
            "https://charts-static.billboard.com/img/2022/11/meghan-trainor-3k0-madeyoulook-t6c-344x344.jpg"
        )
    )

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        val musicList = MyMusicAdapter(musicList)
        binding.rvMusicList.adapter = musicList
        binding.rvMusicList.layoutManager = LinearLayoutManager(context)

        musicList.setOnCLickCallBack(object : MyMusicAdapter.OnItemClickCallBack {
            override fun onItemClicked(data: MusicData) {
                val intent = Intent(requireActivity(), PlayMusicActivity::class.java)
                intent.putExtra("stringData", data)
                startActivity(intent)
            }
        })
    }
}