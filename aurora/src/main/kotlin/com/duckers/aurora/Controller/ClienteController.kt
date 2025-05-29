package com.duckers.aurora.Controller

import com.duckers.aurora.Application.ClienteApplication
import com.duckers.aurora.Model.ClienteModel
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/cliente")
class ClienteController(
    private val clienteApplication: ClienteApplication
) {

    @PostMapping
    fun createCliente(@RequestBody cliente: ClienteModel) : ResponseEntity<Void>{
        clienteApplication.createCliente(cliente)
        return ResponseEntity.ok().build()
    }

    @GetMapping("/{id}")
    fun getClienteById(@PathVariable id: Long): ClienteModel {
        return clienteApplication.getClienteById(id)
    }
    @GetMapping("/email/{email}")
    fun getClienteByEmail(@PathVariable email: String): ClienteModel?{
        return clienteApplication.getClienteByEmail(email)
    }

    @GetMapping
    fun getAllClientes(): List<ClienteModel> {
        return clienteApplication.getAllCliente()
    }

    @PutMapping("/{id}")
    fun updateCliente(@PathVariable id: Long, @RequestBody cliente: ClienteModel) {
        clienteApplication.updateCliente( cliente)
    }

    @DeleteMapping("/{id}")
    fun deleteCliente(@PathVariable id: Long) {
        clienteApplication.deleteCliente(id)
    }
}