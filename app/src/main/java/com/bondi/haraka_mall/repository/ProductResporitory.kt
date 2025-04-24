package com.bondi.haraka_mall.repository

import android.content.Context
import com.bondi.haraka_mall.data.ProductDatabase
import com.bondi.haraka_mall.model.Product

class ProductRepository(context: Context) {
    private val productDao = ProductDatabase.getDatabase(context).productDao()

    suspend fun insertProduct(product: Product) {
        productDao.insertProduct(product)
    }

    fun getAllProducts() = productDao.getAllProducts()

    suspend fun deleteProduct(product: Product) = productDao.deleteProduct(product)
}