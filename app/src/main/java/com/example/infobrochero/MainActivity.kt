package com.example.infobrochero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.infobrochero.Adapter.LugaresAdapter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecyclerview ()

    }

     private fun initRecyclerview() {
       val recyclerView = findViewById<RecyclerView>(R.id.recyclerLugares)
       recyclerView.layoutManager = LinearLayoutManager(this)
       recyclerView.adapter = LugaresAdapter(LugaresProviders.LugaresList)
    }

}