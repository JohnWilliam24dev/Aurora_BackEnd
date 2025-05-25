package com.duckers.aurora.repository

import com.duckers.aurora.Model.ClienteModel
import com.duckers.aurora.repository.JPA.ClienteJPA

class ClienteRepository {
    private val clienteJPA: ClienteJPA;
    constructor(clienteJPA: ClienteJPA){
        this.clienteJPA= clienteJPA;
    }
    fun createCliente(clienteModel: ClienteModel){
        clienteJPA.save(clienteModel)

    }
    fun getClienteById(id:Long): ClienteModel {
        return clienteJPA.findById(id).get()
    }
    fun getAllCliente(): List<ClienteModel>{
        return clienteJPA.findAll()
    }
    fun updateCliente(clienteModel: ClienteModel){
        clienteJPA.save(clienteModel)
    }
    fun deleteCliente(id: Long){
        clienteJPA.deleteById(id)
    }
}