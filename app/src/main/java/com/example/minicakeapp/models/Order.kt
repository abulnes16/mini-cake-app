package com.example.minicakeapp.models

const val CUPCAKE_PRICE = 20
const val PICKUP_FEE = 0.3

class Order(
    val emitter: String,
    val receiver: String,
    val numberOfCupcakes: Int,
    val flavor: String,
    val pickupDate: String,
) {


    fun getTotal(): Double {
        return numberOfCupcakes * CUPCAKE_PRICE + PICKUP_FEE
    }

}