package com.example.infobrochero.Adapter

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.infobrochero.Lugar
import com.example.infobrochero.R


class LugaresViewHolder (view:View):RecyclerView.ViewHolder(view){

    val nombre = view.findViewById<TextView>(R.id.tvNombre)
    val  descripcion = view.findViewById<TextView>(R.id.tvDescripcion)
    val  foto = view.findViewById<ImageView>(R.id.ivLugares)

    fun render (lugarModel: Lugar){
        nombre.text = lugarModel.nombre
        descripcion.text = lugarModel.descripcion
        Glide.with(foto.context).load(lugarModel.foto).into(foto)

    }
}