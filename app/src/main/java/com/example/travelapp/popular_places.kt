package com.example.travelapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager

import androidx.recyclerview.widget.RecyclerView

class popular_places : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_popular_places)
        // ---------------- New RecyclerView (recyclerViewDestinations) ----------------
        val recyclerViewDestinations = findViewById<RecyclerView>(R.id.recyclerViewDestinations)
        // ✅ Use GridLayoutManager → 2 columns (2 images per row)
        recyclerViewDestinations.layoutManager = GridLayoutManager(this, 2)

        val extraDestinations = listOf(
            Destination(R.drawable.nilhadri, "Nilhadri", "Odisha","4.8"),
            Destination(R.drawable.tajmahal, "Taj Mahal", "Agra","4.6"),
            Destination(R.drawable.redfort, "Red Fort", "Delhi","4.5"),
            Destination(R.drawable.redfort, "Red Fort", "Delhi","4.5"),
            Destination(R.drawable.tajmahal, "Taj Mahal", "Agra","4.6"),
            Destination(R.drawable.tajmahal, "Taj Mahal", "Agra","4.6"),

            )
        recyclerViewDestinations.adapter = DestinationAdapter(
            extraDestinations
         )
    }

        }
