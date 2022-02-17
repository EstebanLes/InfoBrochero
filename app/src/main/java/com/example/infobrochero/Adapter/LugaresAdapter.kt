package com.example.infobrochero.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.infobrochero.Lugar
import com.example.infobrochero.R

class LugaresAdapter (private val lugarList:List<Lugar>, private val onClickListener:(Lugar)-> Unit) : RecyclerView.Adapter<LugaresViewHolder> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugaresViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return LugaresViewHolder(layoutInflater.inflate(R.layout.item_lugares,parent,false))
    }

    override fun onBindViewHolder(holder: LugaresViewHolder, position: Int) {
        val item = lugarList[position]
        holder.render(item, onClickListener)
    }

    override fun getItemCount(): Int = lugarList.size
}