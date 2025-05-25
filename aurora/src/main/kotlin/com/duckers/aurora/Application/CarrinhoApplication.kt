package com.duckers.aurora.Application

import com.duckers.aurora.Model.CarrinhoModel
import com.duckers.aurora.repository.CarrinhoRepository

class CarrinhoApplication {
    private val carrinhoRepository: CarrinhoRepository;
    constructor(carrinhoRepository: CarrinhoRepository){
        this.carrinhoRepository=carrinhoRepository;
    }
    fun createCarrinho(carrinhoModel: CarrinhoModel){
        carrinhoRepository.createCarrinho(carrinhoModel)

    }
    fun getCarrinhoById(id:Long): CarrinhoModel {
        return carrinhoRepository.getCarrinhoById(id)
    }
    fun getAllCarrinho(): List<CarrinhoModel>{
        return carrinhoRepository.getAllCarrinho()
    }
    fun updateCarrinho(carrinhoModel: CarrinhoModel){
        carrinhoRepository.updateCarrinho(carrinhoModel )
    }
    fun deleteCarrinho(id: Long) {
        carrinhoRepository.deleteCarrinho(id)
    }
}