package com.example.mediame

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.widget.AppCompatButton
import androidx.recyclerview.widget.RecyclerView
import coil.load

class Adapter(val list: List<Myarticles.Article>) : RecyclerView.Adapter<Adapter.myviewholder>()

{

    class myviewholder(myview: View) : RecyclerView.ViewHolder(myview) {

        val profile = myview.findViewById<ImageView>(R.id.profileid)
        val nameid = myview.findViewById<TextView>(R.id.nameid)
        val dateandtime = myview.findViewById<TextView>(R.id.dateandtime)
        val tittleid = myview.findViewById<TextView>(R.id.tittleid)
        val articleabout = myview.findViewById<TextView>(R.id.articleaboutid)
        val writarticleid = myview.findViewById<TextView>(R.id.writearticleid)
        val tagid = myview.findViewById<TextView>(R.id.tagid)

        val commentId = myview.findViewById<AppCompatButton>(R.id.commentid)
        val likeBtn = myview.findViewById<AppCompatButton>(R.id.likeid)

        val liketext = myview.findViewById<TextView>(R.id.liketextid)
        val commenttext = myview.findViewById<TextView>(R.id.textcommentid)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): myviewholder {

        val viewholder =
            myviewholder(LayoutInflater.from(parent.context).inflate(R.layout.child, parent, false))

        return viewholder

    }

    override fun onBindViewHolder(holder: myviewholder, position: Int) {

        //recyclerview post
        val item = list[position]
        holder.profile.load(item.author?.image)
        holder.nameid.text = item.author?.username
        holder.dateandtime.text = item.updatedAt
        holder.tittleid.text = item.title
        holder.articleabout.text=item.description
        holder.writarticleid.text=item.body
        holder.tagid.text = item.tagList.toString()
        holder.liketext.text = item.favoritesCount.toString()
//        holder.commenttext.text = item..toString()


        holder.likeBtn.setOnClickListener {

           //like button .. sohag er kache jante hobe..

        }

            //comment e click korle ..new fragment open hobe..
        holder.commentId.setOnClickListener {
            onClick?.invoke(item.title.toString())

        }

    }

    var onClick: ((String) -> Unit)? = null


    override fun getItemCount(): Int {
        return list.size
    }


}

