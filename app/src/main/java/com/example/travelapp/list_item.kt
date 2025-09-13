package com.example.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class list_item : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityitem) // ✅ this has your RecyclerView

        // Find RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // LayoutManager → vertical list
        recyclerView.layoutManager =LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Dummy data (use your own images/text here)
        val destinations = listOf(
            Destination(R.drawable.nilhadri, "Nilhadri", "Odisha","4.8"),
            Destination(R.drawable.tajmahal, "Taj Mahal", "Agra","4.6") ,
            Destination(R.drawable.tajmahal, "Taj Mahal", "Agra","4.6")
        )

        // Attach adapter
        recyclerView.adapter = DestinationAdapter(destinations)
    }
}
