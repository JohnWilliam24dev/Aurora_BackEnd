package com.duckers.aurora.repository

import com.duckers.aurora.Model.ItemCarrinhoModel
import com.duckers.aurora.repository.JPA.ItemCarrinhoJPA

class ItemCarrinhoRepository {
    private val itemCarrinhoJPA: ItemCarrinhoJPA;
    constructor(itemCarrinhoJPA: ItemCarrinhoJPA){
        this.itemCarrinhoJPA= itemCarrinhoJPA;
    }
    fun createItemCarrinho(itemCarrinhoModel: ItemCarrinhoModel){
        itemCarrinhoJPA.save(itemCarrinhoModel)

    }
    fun getItemCarrinhoById(id:Long): ItemCarrinhoModel {
        return itemCarrinhoJPA.findById(id).get()
    }
    fun getAllItemCarrinho(): List<ItemCarrinhoModel>{
        return itemCarrinhoJPA.findAll()
    }
    fun updateItemCarrinho(itemCarrinhoModel: ItemCarrinhoModel){
        itemCarrinhoJPA.save(itemCarrinhoModel)
    }
    fun deleteItemCarrinho(id: Long){
        itemCarrinhoJPA.deleteById(id)
    }
}