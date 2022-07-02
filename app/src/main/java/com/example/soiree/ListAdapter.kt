package com.example.soiree

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ListAdapter(private val ListList:ArrayList<List>)
    :RecyclerView.Adapter<ListAdapter.ListViewHolder>(){

    class ListViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){

        val imageView: ImageView = itemView.findViewById(R.id.imageView)
        val textView: TextView = itemView.findViewById(R.id.textView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.itemlist, parent,false)
        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        val list = ListList[position]
        holder.imageView.setImageResource(list.image)
        holder.textView.text = list.name
    }

    override fun getItemCount(): Int {
        return ListList.size
    }
}