package com.example.recycle_view_jp.data

import com.example.recycle_view_jp.R
import com.example.recycle_view_jp.model.JapanImg

class Datasource {

    fun loadImages(): List<JapanImg>{
        return listOf(
            JapanImg(R.drawable.img1),
            JapanImg(R.drawable.img2),
            JapanImg(R.drawable.img3),
            JapanImg(R.drawable.img4),
            JapanImg(R.drawable.img5),
            JapanImg(R.drawable.img6),
            JapanImg(R.drawable.img7),
            JapanImg(R.drawable.img8),
            JapanImg(R.drawable.img9),
            JapanImg(R.drawable.img10)
        )
    }
}