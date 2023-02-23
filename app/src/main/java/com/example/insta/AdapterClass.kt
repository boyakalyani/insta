package com.example.insta

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class AdapterClass(private var instaList:List<DataClass1>): RecyclerView.Adapter<AdapterClass.ViewHolder1>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder1 {
        val item= LayoutInflater.from(parent.context).inflate(R.layout.recycler1_design,parent,false)
        return ViewHolder1(item)
    }

    override fun onBindViewHolder(holder: ViewHolder1, position: Int) {
        val dataClass1=instaList[position]
        holder.imges.setImageResource(dataClass1.img1)
        holder.Text1.text=dataClass1.text1
        holder.Text2.text=dataClass1.text2
    }

    override fun getItemCount(): Int {
        return instaList.size
    }
    class ViewHolder1(items: View):RecyclerView.ViewHolder(items) {
        var imges: ImageView = itemView.findViewById(R.id.recyclerImg_id)
        var Text1: TextView = itemView.findViewById(R.id.recyclerTv_id)
        var Text2: TextView = itemView.findViewById(R.id.recyclerTv2_id)
    }

}