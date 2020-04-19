package com.example.willow.model

/**
 * Created by cheruiyot
 * On 19,April,2020
 */
data class Rental(
    var type: String,
    var price: Double,
    var numberOfRooms: Int,
    val location: String,
    var isAvailable: Boolean
)