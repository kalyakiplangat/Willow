package com.example.willow.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.willow.R
import com.example.willow.model.Rental

/**
 * Created by cheruiyot
 * On 19,April,2020
 */
class RentalAdapter(val context: Context,var rentals: List<Rental>): RecyclerView.Adapter<RentalAdapter.RentalViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RentalViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_rental_list, parent, false)
        return RentalViewHolder(view)
    }

    override fun getItemCount() = rentals.size

    override fun onBindViewHolder(holder: RentalViewHolder, position: Int) {
        val rental = rentals[position]
        holder.rentalType.text = rental.type
        holder.price.text = rental.price.toString()
        holder.photoSlides.text = rental.isAvailable.toString()
        holder.rooms.text = rental.numberOfRooms.toString()
        holder.location.text = rental.location

    }

    class RentalViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        val rentalType = itemView.findViewById<TextView>(R.id.textType)
        val price = itemView.findViewById<TextView>(R.id.textPrice)
        val rooms = itemView.findViewById<TextView>(R.id.textRooms)
        val photoSlides = itemView.findViewById<TextView>(R.id.photoSlides)
        val location = itemView.findViewById<TextView>(R.id.textLocation)
    }

}