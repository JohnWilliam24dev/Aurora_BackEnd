package com.duckers.aurora.Controller

import com.duckers.aurora.Application.SimulacaoCompraApplication
import com.duckers.aurora.Model.SimulacaoCompraModel

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/simulacaoCompra")
class SimulacaoCompraController(
    private val simulacaoCompraApplication: SimulacaoCompraApplication
) {

    @PostMapping
    fun createSimulacaoCompra(@RequestBody simulacaoCompra: SimulacaoCompraModel) {
        simulacaoCompraApplication.createSimulacaoCompra(simulacaoCompra)
    }

    @GetMapping("/{id}")
    fun getSimulacaoCompraById(@PathVariable id: Long): SimulacaoCompraModel {
        return simulacaoCompraApplication.getSimulacaoCompraById(id)
    }

    @GetMapping
    fun getAllSimulacaoCompras(): List<SimulacaoCompraModel> {
        return simulacaoCompraApplication.getAllSimulacaoCompra()
    }

    @PutMapping("/{id}")
    fun updateSimulacaoCompra(@PathVariable id: Long, @RequestBody simulacaoCompra: SimulacaoCompraModel) {
        simulacaoCompraApplication.updateSimulacaoCompra( simulacaoCompra)
    }

    @DeleteMapping("/{id}")
    fun deleteSimulacaoCompra(@PathVariable id: Long) {
        simulacaoCompraApplication.deleteSimulacaoCompra(id)
    }
}