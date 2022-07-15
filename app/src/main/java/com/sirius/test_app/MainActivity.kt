package com.sirius.test_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerViewReviews = findViewById<RecyclerView>(R.id.Reviews)
        recyclerViewReviews.layoutManager = LinearLayoutManager(this)

        val reviewList = mutableListOf(
            ReviewModel(
                userImage = "https://ibb.co/WcJMjSw",
                userName = "Auguste Conte",
                date = "February 14, 2019",
                message = "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
            ),
            ReviewModel(
                userImage = "https://ibb.co/p1q4QZr",
                userName = "Jang Marcelino",
                date = "February 14, 2019",
                message =
                "Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers."
            )
        )
        val adapter = ReviewsAdapter(reviewList)
        recyclerViewReviews.adapter = adapter

    }
}
