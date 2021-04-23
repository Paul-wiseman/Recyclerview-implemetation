package com.sriyank.paul.vacationspots

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.sriyank.vacationspots.VacationSpots

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

setupRecyclerView()

    }

    private fun setupRecyclerView() {
        val adapter = MyAdapter(this, VacationSpots.list!!)
        findViewById<RecyclerView>(R.id.recyclerView).adapter = adapter

        val layoutManager = LinearLayoutManager(this)
        layoutManager.orientation = RecyclerView.VERTICAL
        findViewById<RecyclerView>(R.id.recyclerView).layoutManager = layoutManager


    }

}