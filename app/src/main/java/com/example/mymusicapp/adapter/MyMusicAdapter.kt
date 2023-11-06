package com.example.mymusicapp.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.mymusicapp.R
import com.example.mymusicapp.data.MusicData

class MyMusicAdapter(private val listMusic: ArrayList<MusicData>) :
    RecyclerView.Adapter<MyMusicAdapter.MyViewHolder>() {

    private lateinit var onItemClickCallBack: OnItemClickCallBack

    interface OnItemClickCallBack {
        fun onItemClicked(data: MusicData)
    }

    fun setOnCLickCallBack(onItemClickCallBack: OnItemClickCallBack) {
        this.onItemClickCallBack = onItemClickCallBack
    }


    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val musicImage: ImageView = itemView.findViewById(R.id.musicImg)
        val musicName: TextView = itemView.findViewById(R.id.musicName)
        val artistName: TextView = itemView.findViewById(R.id.artistName)
        val duration: TextView = itemView.findViewById(R.id.duration)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView: View =
            LayoutInflater.from(parent.context).inflate(R.layout.mymusic_card, parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return listMusic.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val curentItem = listMusic[position]
        Glide.with(holder.itemView.context).load(curentItem.imageMusic).into(holder.musicImage)
        holder.musicName.text = curentItem.nameMusic
        holder.artistName.text = curentItem.artist
        holder.duration.text = curentItem.duration
        holder.itemView.setOnClickListener {
            onItemClickCallBack.onItemClicked(curentItem) }

    }

}