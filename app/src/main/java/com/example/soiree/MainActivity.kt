package com.example.soiree

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var listList : ArrayList<List>
    private lateinit var listAdapter: ListAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView =findViewById(R.id.recyclerView)
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

        listList = ArrayList()


        listList.add(List(R.drawable.content,"Content and marketing Conference"))
        listList.add(List(R.drawable.contest,"Programming Contest"))
        listList.add(List(R.drawable.eventpic,"12th Ministerial Conference"))
        listList.add(List(R.drawable.imagespsyco,"Conference On Psychology"))


        listAdapter = ListAdapter(listList)
        recyclerView.adapter = listAdapter


    }
}