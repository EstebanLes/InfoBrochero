package com.example.infobrochero

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.DividerItemDecoration
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
        initRecyclerview()

    }

    private fun initRecyclerview() {
        val manager =
            LinearLayoutManager(this)                            //aca se hace el manager para pasarlo a la variable decoration
        val decoration =
            DividerItemDecoration(                                      //aca se usa el decoration para orientarlo y mas abajo se hace el binding para usarlo
                this,
                manager.orientation
            )
        binding.recyclerLugares.layoutManager = manager
        binding.recyclerLugares.adapter =
            LugaresAdapter(LugaresProviders.LugaresList) { lugar ->
                onItemSelect(
                    lugar
                )
            }
        binding.recyclerLugares.addItemDecoration(decoration)            //aca se usa el binding y se usa el decoration para que dibuje las lineas
    }

    fun onItemSelect (lugar: Lugar){
        Toast.makeText(this,lugar.descripcion,Toast.LENGTH_LONG).show()
    }
}