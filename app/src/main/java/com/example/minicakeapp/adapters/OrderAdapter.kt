package com.example.minicakeapp.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.minicakeapp.R
import com.example.minicakeapp.models.Order

class OrderAdapter(
    private val context: Context,
    private val dataset: List<Order>
) : RecyclerView.Adapter<OrderAdapter.ItemViewHolder>() {

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val orderTitle: TextView = view.findViewById(R.id.txt_order_title)
        val receiver: TextView = view.findViewById(R.id.txt_receiver)
        val pickupText: TextView = view.findViewById(R.id.txt_pickup_date)
        val orderTotal: TextView = view.findViewById(R.id.txt_total_order)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout =
            LayoutInflater.from(parent.context).inflate(R.layout.order_item, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = dataset[position]
        holder.orderTitle.text = "Order 1"
        holder.receiver.text = item.receiver
        holder.orderTotal.text = item.getTotal().toString()
        holder.pickupText.text = item.pickupDate
    }

    override fun getItemCount() = dataset.size

}