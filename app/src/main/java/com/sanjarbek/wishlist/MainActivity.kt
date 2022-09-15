package com.sanjarbek.wishlist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.sanjarbek.wishlist.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var viewBinding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        viewBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(viewBinding.root)

        val item_list = ArrayList<ItemModel>()
        val adapter = ItemAdapter(this, item_list)
        viewBinding.rcvItems.adapter = adapter

        viewBinding.btnAdd.setOnClickListener {
            val item_name = viewBinding.edtName.text.toString()
            val item_price = viewBinding.edtPrice.text.toString()
            val item_url = viewBinding.edtUrl.text.toString()

            val item = ItemModel()

            item.set_name(item_name)
            item.set_price(item_price)
            item.set_url(item_url)


            item_list.add(item)
            runOnUiThread {
                adapter.notifyItemInserted(item_list.size-1)
            }

        }
    }
}