package com.duckers.aurora.Application

import com.duckers.aurora.Model.ClienteModel
import com.duckers.aurora.repository.ClienteRepository

class ClienteApplication {
    private val clienteRepository: ClienteRepository;
    constructor(clienteRepository: ClienteRepository){
        this.clienteRepository=clienteRepository;
    }
    fun createCliente(clienteModel: ClienteModel){
        clienteRepository.createCliente(clienteModel)

    }
    fun getClienteById(id:Long): ClienteModel {
        return clienteRepository.getClienteById(id)
    }
    fun getAllCliente(): List<ClienteModel>{
        return clienteRepository.getAllCliente()
    }
    fun updateCliente(clienteModel: ClienteModel){
        clienteRepository.updateCliente(clienteModel )
    }
    fun deleteCliente(id: Long) {
        clienteRepository.deleteCliente(id)
    }
}