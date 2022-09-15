package com.sanjarbek.wishlist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(val context: Context, val itemModelArrayList: ArrayList<ItemModel>): RecyclerView.Adapter<ItemAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_layout, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = itemModelArrayList.get(position)

        holder.item_name.text = model.get_name()
        holder.item_price.text = model.get_price()
        holder.item_url.text = model.get_url()
    }

    override fun getItemCount(): Int {
        return itemModelArrayList.size
    }

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        val item_price = itemView.findViewById<TextView>(R.id.item_price)
        val item_name = itemView.findViewById<TextView>(R.id.item_name)
        val item_url = itemView.findViewById<TextView>(R.id.item_url)
    }
}
