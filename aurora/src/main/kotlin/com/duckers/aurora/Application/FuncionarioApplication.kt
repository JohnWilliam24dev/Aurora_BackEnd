package com.duckers.aurora.Application

import com.duckers.aurora.Model.FuncionarioModel
import com.duckers.aurora.repository.FuncionarioRepository

class FuncionarioApplication {
    private val funcionarioRepository: FuncionarioRepository;
    constructor(funcionarioRepository: FuncionarioRepository){
        this.funcionarioRepository=funcionarioRepository;
    }
    fun createFuncionario(funcionarioModel: FuncionarioModel){
        funcionarioRepository.createFuncionario(funcionarioModel)

    }
    fun getFuncionarioById(id:Long): FuncionarioModel {
        return funcionarioRepository.getFuncionarioById(id)
    }
    fun getAllFuncionario(): List<FuncionarioModel>{
        return funcionarioRepository.getAllFuncionario()
    }
    fun updateFuncionario(funcionarioModel: FuncionarioModel){
        funcionarioRepository.updateFuncionario(funcionarioModel )
    }
    fun deleteFuncionario(id: Long) {
        funcionarioRepository.deleteFuncionario(id)
    }
}