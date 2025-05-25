package com.duckers.aurora.Controller

import com.duckers.aurora.Application.EnderecoApplication
import com.duckers.aurora.Model.EnderecoModel

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/endereco")
class EnderecoController(
    private val enderecoApplication: EnderecoApplication
) {

    @PostMapping
    fun createEndereco(@RequestBody endereco: EnderecoModel) {
        enderecoApplication.createEndereco(endereco)
    }

    @GetMapping("/{id}")
    fun getEnderecoById(@PathVariable id: Long): EnderecoModel {
        return enderecoApplication.getEnderecoById(id)
    }

    @GetMapping
    fun getAllEnderecos(): List<EnderecoModel> {
        return enderecoApplication.getAllEndereco()
    }

    @PutMapping("/{id}")
    fun updateEndereco(@PathVariable id: Long, @RequestBody endereco: EnderecoModel) {
        enderecoApplication.updateEndereco( endereco)
    }

    @DeleteMapping("/{id}")
    fun deleteEndereco(@PathVariable id: Long) {
        enderecoApplication.deleteEndereco(id)
    }
}