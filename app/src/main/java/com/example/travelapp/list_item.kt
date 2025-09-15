package com.example.travelapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import android.content.Intent
import android.widget.TextView


class list_item : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activityitem) // ✅ this has your RecyclerView
        val seeAllTextView = findViewById<TextView>(R.id.tv_see_all_popular)
        seeAllTextView.setOnClickListener {
            val intent = Intent(this, popular_places::class.java)
            startActivity(intent)
        }

        // Find RecyclerView
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)

        // LayoutManager → vertical list
        recyclerView.layoutManager =LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        // Dummy data (use your own images/text here)
        val destinations = listOf(
            Destination(R.drawable.nilhadri, "Nilhadri", "Odisha","4.8"),
            Destination(R.drawable.tajmahal, "Taj Mahal", "Agra","4.6") ,
            Destination(R.drawable.qutubminar, "Qutub Minar", "Delhi","4.6") ,
            Destination(R.drawable.redfort, "Red Fort", "Delhi","4.6"),
            Destination(R.drawable.goldentemple, "Golden temple", "Delhi","4.6")

        )
        val recyclerViewLarge = findViewById<RecyclerView>(R.id.rv_popular_destinations)
        recyclerViewLarge.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

        val largeDestinations = listOf(
            Destination(R.drawable.qutubminar, "Qutub Minar", "Delhi","4.6"),
            Destination(R.drawable.redfort, "Red Fort", "Delhi","4.6"),
            Destination(R.drawable.goldentemple, "Golden Temple", "Amritsar","4.7")
        )

        recyclerViewLarge.adapter = DestinationAdapter(
            largeDestinations)
        // Attach adapter
        recyclerView.adapter = DestinationAdapter(destinations)
    }
}
