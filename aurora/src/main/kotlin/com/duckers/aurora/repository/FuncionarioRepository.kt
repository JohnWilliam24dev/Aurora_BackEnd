package com.duckers.aurora.repository

import com.duckers.aurora.Model.FuncionarioModel
import com.duckers.aurora.repository.JPA.FuncionarioJPA
import org.springframework.stereotype.Repository

@Repository
class FuncionarioRepository {
    private val funcionarioJPA: FuncionarioJPA;
    constructor(funcionarioJPA: FuncionarioJPA){
        this.funcionarioJPA= funcionarioJPA;
    }
    fun createFuncionario(funcionarioModel: FuncionarioModel){
        funcionarioJPA.save(funcionarioModel)

    }
    fun findByCPF(cpf: String): FuncionarioModel?{
        return funcionarioJPA.findByCpf(cpf)
    }
    fun getFuncionarioById(id:Long): FuncionarioModel {
        return funcionarioJPA.findById(id).get()
    }
    fun getAllFuncionario(): List<FuncionarioModel>{
        return funcionarioJPA.findAll()
    }
    fun updateFuncionario(funcionarioModel: FuncionarioModel){
        funcionarioJPA.save(funcionarioModel)
    }
    fun deleteFuncionario(id: Long){
        funcionarioJPA.deleteById(id)
    }
}