package com.duckers.aurora.repository

import com.duckers.aurora.Model.CarrinhoModel
import com.duckers.aurora.repository.JPA.CarrinhoJPA
import org.springframework.stereotype.Repository

@Repository
class CarrinhoRepository {
    private val carrinhoJPA: CarrinhoJPA;
    constructor(carrinhoJPA: CarrinhoJPA){
        this.carrinhoJPA= carrinhoJPA;
    }
    fun createCarrinho(carrinhoModel: CarrinhoModel){
        carrinhoJPA.save(carrinhoModel)

    }
    fun getCarrinhoById(id:Long): CarrinhoModel {
        return carrinhoJPA.findById(id).get()
    }
    fun getAllCarrinho(): List<CarrinhoModel>{
        return carrinhoJPA.findAll()
    }
    fun updateCarrinho(carrinhoModel: CarrinhoModel){
        carrinhoJPA.save(carrinhoModel)
    }
    fun deleteCarrinho(id: Long){
        carrinhoJPA.deleteById(id)
    }

}