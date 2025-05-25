package com.duckers.aurora.Application

import com.duckers.aurora.Model.EnderecoModel
import com.duckers.aurora.repository.EnderecoRepository

class EnderecoApplication {
    private val enderecoRepository: EnderecoRepository;
    constructor(enderecoRepository: EnderecoRepository){
        this.enderecoRepository=enderecoRepository;
    }
    fun createEndereco(enderecoModel: EnderecoModel){
        enderecoRepository.createEndereco(enderecoModel)

    }
    fun getEnderecoById(id:Long): EnderecoModel {
        return enderecoRepository.getEnderecoById(id)
    }
    fun getAllEndereco(): List<EnderecoModel>{
        return enderecoRepository.getAllEndereco()
    }
    fun updateEndereco(enderecoModel: EnderecoModel){
        enderecoRepository.updateEndereco(enderecoModel )
    }
    fun deleteEndereco(id: Long) {
        enderecoRepository.deleteEndereco(id)
    }
}


