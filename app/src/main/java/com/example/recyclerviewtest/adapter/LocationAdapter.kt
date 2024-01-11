package com.example.recyclerviewtest.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerviewtest.R
import com.example.recyclerviewtest.data.Location
import com.example.recyclerviewtest.viewholder.LocationViewholder

class LocationAdapter(private val locations:List<Location>) : RecyclerView.Adapter<LocationViewholder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LocationViewholder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_location, parent, false)
        return LocationViewholder(view)
    }

    override fun onBindViewHolder(holder: LocationViewholder, position: Int) {
        holder.bind(locations[position])
    }

    override fun getItemCount()= locations.size
}
