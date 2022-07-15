package com.sirius.test_app

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ReviewsAdapter(
    val reviews: List<ReviewModel> = listOf(
        ReviewModel(
            userImage = "https://ibb.co/WcJMjSw",
            userName = "Auguste Conte",
            date = "February 14, 2019",
            message = "“Once you start to learn its secrets, there’s a wild and exciting variety of play here that’s unmatched, even by its peers.”"
        )
    )
) : RecyclerView.Adapter<ReviewsAdapter.ReviewViewHolder>() {

    inner class ReviewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ReviewViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_review, parent, false)
        return ReviewViewHolder(view)
    }

    override fun onBindViewHolder(holder: ReviewViewHolder, position: Int) {
        holder.itemView.apply {
            val review = reviews[position]
            val userIconImage: ImageView = holder.itemView.findViewById(R.id.imageView2)
            val imageStringAddress = review.userImage
            val userName: TextView = holder.itemView.findViewById(R.id.textView8)
            val reviewDate: TextView = holder.itemView.findViewById(R.id.textView9)
            val messageText: TextView = holder.itemView.findViewById(R.id.textView10)
            userName.text = review.userName
            reviewDate.text = review.date
            messageText.text = review.message
        }

    }

    override fun getItemCount(): Int {
        return reviews.size
    }
}
