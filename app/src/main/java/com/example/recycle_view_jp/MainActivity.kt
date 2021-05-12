package com.example.recycle_view_jp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.recycle_view_jp.adapter.ImageAdapter
import com.example.recycle_view_jp.data.Datasource

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Initialize data.
        val myDataSet = Datasource().loadImages()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ImageAdapter(myDataSet)

        recyclerView.setHasFixedSize(true)
    }
}