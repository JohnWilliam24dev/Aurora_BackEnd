package com.duckers.aurora.repository

import com.duckers.aurora.Model.ItemSimulacaoModel
import com.duckers.aurora.repository.JPA.ItemSimulacaoJPA

class ItemSimulacaoRepository {
    private val itemSimulacaoJPA: ItemSimulacaoJPA;
    constructor(itemSimulacaoJPA: ItemSimulacaoJPA){
        this.itemSimulacaoJPA= itemSimulacaoJPA;
    }
    fun createItemSimulacao(itemSimulacaoModel: ItemSimulacaoModel){
        itemSimulacaoJPA.save(itemSimulacaoModel)

    }
    fun getItemSimulacaoById(id:Long): ItemSimulacaoModel {
        return itemSimulacaoJPA.findById(id).get()
    }
    fun getAllItemSimulacao(): List<ItemSimulacaoModel>{
        return itemSimulacaoJPA.findAll()
    }
    fun updateItemSimulacao(itemSimulacaoModel: ItemSimulacaoModel){
        itemSimulacaoJPA.save(itemSimulacaoModel)
    }
    fun deleteItemSimulacao(id: Long){
        itemSimulacaoJPA.deleteById(id)
    }
}