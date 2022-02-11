package com.example.mediame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Commentadapter (val list: List<Commentdata>):RecyclerView.Adapter<Commentadapter.myviewholder>() {
    class myviewholder(myview:View):RecyclerView.ViewHolder(myview){
        val name=myview.findViewById<TextView>(R.id.namecomment)
        val time=myview.findViewById<TextView>(R.id.time)
        val commented=myview.findViewById<TextView>(R.id.commenttext2)
        val commenttext=myview.findViewById<TextView>(R.id.commenttext)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {

        val viewholder=myviewholder(LayoutInflater.from(parent.context).inflate(R.layout.comment ,parent,false))

        return viewholder
    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {

        val item =list[position]

        holder.name.text=item.name
        holder.time.text=item.time
        holder.commented.text=item.commented
        holder.commenttext.text=item.commentedtext


    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}