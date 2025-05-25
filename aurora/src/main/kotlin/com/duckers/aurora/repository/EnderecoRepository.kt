package com.duckers.aurora.repository

import com.duckers.aurora.Model.EnderecoModel
import com.duckers.aurora.repository.JPA.EnderecoJPA

class EnderecoRepository {
    private val enderecoJPA: EnderecoJPA;
    constructor(enderecoJPA: EnderecoJPA){
        this.enderecoJPA= enderecoJPA;
    }
    fun createEndereco(enderecoModel: EnderecoModel){
        enderecoJPA.save(enderecoModel)

    }
    fun getEnderecoById(id:Long): EnderecoModel {
        return enderecoJPA.findById(id).get()
    }
    fun getAllEndereco(): List<EnderecoModel>{
        return enderecoJPA.findAll()
    }
    fun updateEndereco(enderecoModel: EnderecoModel){
        enderecoJPA.save(enderecoModel)
    }
    fun deleteEndereco(id: Long){
        enderecoJPA.deleteById(id)
    }
}