package com.example.infobrochero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.infobrochero.Adapter.LugaresAdapter
import com.example.infobrochero.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerview ()

    }

     private fun initRecyclerview() {
       binding.recyclerLugares.layoutManager = LinearLayoutManager(this)
       binding.recyclerLugares.adapter = LugaresAdapter(LugaresProviders.LugaresList)
    }

}