package com.example.infobrochero.Adapter

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.infobrochero.Lugar

class LugaresAdapter (val LugaresList:List<Lugar> ) : RecyclerView.Adapter<LugaresAdapter> (){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LugaresAdapter {

    }

    override fun onBindViewHolder(holder: LugaresAdapter, position: Int) {

    }

    override fun getItemCount(): Int = LugaresList.size
}