package com.duckers.aurora.Application

import com.duckers.aurora.Model.SimulacaoCompraModel
import com.duckers.aurora.repository.SimulacaoCompraRepository

class SimulacaoCompraApplication {
    private val simulacaoCompraRepository: SimulacaoCompraRepository;
    constructor(simulacaoCompraRepository: SimulacaoCompraRepository){
        this.simulacaoCompraRepository=simulacaoCompraRepository;
    }
    fun createSimulacaoCompra(simulacaoCompraModel: SimulacaoCompraModel){
        simulacaoCompraRepository.createSimulacaoCompra(simulacaoCompraModel)

    }
    fun getSimulacaoCompraById(id:Long): SimulacaoCompraModel {
        return simulacaoCompraRepository.getSimulacaoCompraById(id)
    }
    fun getAllSimulacaoCompra(): List<SimulacaoCompraModel>{
        return simulacaoCompraRepository.getAllSimulacaoCompra()
    }
    fun updateSimulacaoCompra(simulacaoCompraModel: SimulacaoCompraModel){
        simulacaoCompraRepository.updateSimulacaoCompra(simulacaoCompraModel )
    }
    fun deleteSimulacaoCompra(id: Long) {
        simulacaoCompraRepository.deleteSimulacaoCompra(id)
    }
}