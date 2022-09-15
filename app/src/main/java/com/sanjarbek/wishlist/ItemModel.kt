package com.sanjarbek.wishlist

class ItemModel {
    private lateinit var itemName: String
    private lateinit var itemPrice: String
    private lateinit var itemURL: String

    fun get_name(): String {
        return itemName
    }

    fun get_price(): String {
        return itemPrice
    }

    fun get_url(): String {
        return itemURL
    }

    fun set_name(name: String) {
        itemName = name
    }

    fun set_price(price: String) {
        itemPrice = price
    }

    fun set_url(url: String) {
        itemURL = url
    }
}