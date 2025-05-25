package com.duckers.aurora.Controller

import com.duckers.aurora.Application.FuncionarioApplication
import com.duckers.aurora.Model.FuncionarioModel

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/funcionario")
class FuncionarioController(
    private val funcionarioApplication: FuncionarioApplication
) {

    @PostMapping
    fun createFuncionario(@RequestBody funcionario: FuncionarioModel) {
        funcionarioApplication.createFuncionario(funcionario)
    }

    @GetMapping("/{id}")
    fun getFuncionarioById(@PathVariable id: Long): FuncionarioModel {
        return funcionarioApplication.getFuncionarioById(id)
    }

    @GetMapping
    fun getAllFuncionarios(): List<FuncionarioModel> {
        return funcionarioApplication.getAllFuncionario()
    }

    @PutMapping("/{id}")
    fun updateFuncionario(@PathVariable id: Long, @RequestBody funcionario: FuncionarioModel) {
        funcionarioApplication.updateFuncionario( funcionario)
    }

    @DeleteMapping("/{id}")
    fun deleteFuncionario(@PathVariable id: Long) {
        funcionarioApplication.deleteFuncionario(id)
    }
}