package com.duckers.aurora.Application

import com.duckers.aurora.Model.ItemSimulacaoModel
import com.duckers.aurora.repository.ItemSimulacaoRepository

class ItemSimulacaoApplication {
    private val itemSimulacaoRepository: ItemSimulacaoRepository;
    constructor(itemSimulacaoRepository: ItemSimulacaoRepository){
        this.itemSimulacaoRepository=itemSimulacaoRepository;
    }
    fun createItemSimulacao(itemSimulacaoModel: ItemSimulacaoModel){
        itemSimulacaoRepository.createItemSimulacao(itemSimulacaoModel)

    }
    fun getItemSimulacaoById(id:Long): ItemSimulacaoModel {
        return itemSimulacaoRepository.getItemSimulacaoById(id)
    }
    fun getAllItemSimulacao(): List<ItemSimulacaoModel>{
        return itemSimulacaoRepository.getAllItemSimulacao()
    }
    fun updateItemSimulacao(itemSimulacaoModel: ItemSimulacaoModel){
        itemSimulacaoRepository.updateItemSimulacao(itemSimulacaoModel )
    }
    fun deleteItemSimulacao(id: Long) {
        itemSimulacaoRepository.deleteItemSimulacao(id)
    }
}