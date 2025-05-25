package com.duckers.aurora.repository

import com.duckers.aurora.Model.SimulacaoCompraModel
import com.duckers.aurora.repository.JPA.SimulacaoCompraJPA

class SimulacaoCompraRepository {
    private val simulacaoCompraJPA: SimulacaoCompraJPA;
    constructor(simulacaoCompraJPA: SimulacaoCompraJPA){
        this.simulacaoCompraJPA= simulacaoCompraJPA;
    }
    fun createSimulacaoCompra(simulacaoCompraModel: SimulacaoCompraModel){
        simulacaoCompraJPA.save(simulacaoCompraModel)

    }
    fun getSimulacaoCompraById(id:Long): SimulacaoCompraModel {
        return simulacaoCompraJPA.findById(id).get()
    }
    fun getAllSimulacaoCompra(): List<SimulacaoCompraModel>{
        return simulacaoCompraJPA.findAll()
    }
    fun updateSimulacaoCompra(simulacaoCompraModel: SimulacaoCompraModel){
        simulacaoCompraJPA.save(simulacaoCompraModel)
    }
    fun deleteSimulacaoCompra(id: Long){
        simulacaoCompraJPA.deleteById(id)
    }
}