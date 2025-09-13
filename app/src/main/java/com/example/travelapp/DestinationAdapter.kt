package com.example.travelapp
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import androidx.recyclerview.widget.RecyclerView

class DestinationAdapter(
    private val destinations: List<Destination>
) : RecyclerView.Adapter<DestinationAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val ivDestination: ImageView = itemView.findViewById(R.id.ivDestination)
        val tvName: TextView = itemView.findViewById(R.id.tv_destination_name)
        val tvState: TextView = itemView.findViewById(R.id.tv_destination_state)
        val tvRating: TextView = itemView.findViewById(R.id.tv_rating)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.itemdestination_small, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val destination = destinations[position]
        holder.ivDestination.setImageResource(destination.imageRes)
        holder.tvName.text = destination.name
        holder.tvState.text= destination.stateName
        holder.tvRating.text = destination.rating

    }

    override fun getItemCount(): Int = destinations.size
}
