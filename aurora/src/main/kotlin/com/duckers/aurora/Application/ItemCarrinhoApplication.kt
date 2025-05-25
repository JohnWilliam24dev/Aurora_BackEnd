package com.duckers.aurora.Application

import com.duckers.aurora.Model.ItemCarrinhoModel
import com.duckers.aurora.repository.ItemCarrinhoRepository


class ItemCarrinhoApplication {
    private val itemCarrinhoRepository: ItemCarrinhoRepository;
    constructor(itemCarrinhoRepository: ItemCarrinhoRepository){
        this.itemCarrinhoRepository=itemCarrinhoRepository;
    }
    fun createItemCarrinho(itemCarrinhoModel: ItemCarrinhoModel){
        itemCarrinhoRepository.createItemCarrinho(itemCarrinhoModel)

    }
    fun getItemCarrinhoById(id:Long): ItemCarrinhoModel {
        return itemCarrinhoRepository.getItemCarrinhoById(id)
    }
    fun getAllItemCarrinho(): List<ItemCarrinhoModel>{
        return itemCarrinhoRepository.getAllItemCarrinho()
    }
    fun updateItemCarrinho(itemCarrinhoModel: ItemCarrinhoModel){
        itemCarrinhoRepository.updateItemCarrinho(itemCarrinhoModel )
    }
    fun deleteItemCarrinho(id: Long) {
        itemCarrinhoRepository.deleteItemCarrinho(id)
    }
}