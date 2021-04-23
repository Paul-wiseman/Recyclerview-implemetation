package com.sriyank.paul.vacationspots

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.view.menu.ActionMenuItemView
import androidx.recyclerview.widget.RecyclerView
import com.sriyank.vacationspots.Destination

class MyAdapter(val context:Context, var destinationList: ArrayList<Destination>):RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {


        fun setData(destination:Destination, position:Int){
            itemView.findViewById<TextView>(R.id.txvPlaceName).text = destination.placeName
            itemView.findViewById<ImageView>(R.id.imvPlace).setImageResource(destination.imageId)

        }
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):MyViewHolder {
        Log.i("MyAdapter","OnCreateViewHolder")
         val itemView = LayoutInflater.from(context).inflate(R.layout.list_item,parent, false)
        return MyViewHolder(itemView)
    }

    override fun getItemCount(): Int =   destinationList.size



    override fun onBindViewHolder(itemViewHolder: MyViewHolder, position: Int) {
        Log.i("MyAdapter","OnBindViewHolder $position")
        val destination = destinationList[position]
        itemViewHolder.setData(destination, position)
    }



}