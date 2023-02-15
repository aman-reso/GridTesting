package com.example.gridtesting

import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter : RecyclerView.Adapter<Holder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Holder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.http, parent, false)
        return Holder(view)
    }

    override fun onBindViewHolder(holder: Holder, position: Int) {
        holder.bindData(data[position])
    }

    override fun getItemCount(): Int {
        return data.size
    }

    private val data = ArrayList<String>()

    fun submitData() {
        data.clear()
        data.addAll(generateData())
        notifyDataSetChanged()
    }
}

class Holder(view: View) : RecyclerView.ViewHolder(view.rootView) {
    val text1: TextView = view.findViewById(R.id.text1)

    fun bindData(strings: String) {
        text1.text = strings
    }
}


fun generateData(): List<String> {
    val list = ArrayList<String>()
    list.add("Stickiness of information")
    list.add("Writing style")
    list.add("Lesson length")
    list.add("Relevance of topic")
    list.add("Easy to follow")
    list.add("Value gained")

    return list
}