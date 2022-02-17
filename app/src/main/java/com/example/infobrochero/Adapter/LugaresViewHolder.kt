package com.example.infobrochero.Adapter

import android.view.View

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.infobrochero.Lugar
import com.example.infobrochero.databinding.ItemLugaresBinding


class LugaresViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    val binding = ItemLugaresBinding.bind(view)

    fun render(lugarModel: Lugar, onClickListener: (Lugar) -> Unit) {
        binding.tvNombre.text = lugarModel.nombre
        binding.tvDescripcion.text = lugarModel.descripcion
        Glide.with(binding.ivLugares.context).load(lugarModel.foto).into(binding.ivLugares)
        itemView.setOnClickListener { onClickListener(lugarModel) }
    }
}