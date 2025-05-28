package com.duckers.aurora.repository

import com.duckers.aurora.Model.ClienteModel
import com.duckers.aurora.repository.JPA.ClienteJPA
import org.springframework.stereotype.Repository

@Repository
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

    fun getClienteByEmail(email: String): ClienteModel? {
        return clienteJPA.findByEmail(email)
    }
    fun updateCliente(clienteModel: ClienteModel){
        clienteJPA.save(clienteModel)
    }
    fun deleteCliente(id: Long){
        clienteJPA.deleteById(id)
    }
}