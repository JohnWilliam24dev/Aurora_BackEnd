package com.duckers.aurora.Controller

import com.duckers.aurora.Application.CarrinhoApplication
import com.duckers.aurora.Model.CarrinhoModel

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/carrinho")
class CarrinhoController(
    private val carrinhoApplication: CarrinhoApplication
) {

    @PostMapping
    fun createCarrinho(@RequestBody carrinho: CarrinhoModel) {
        carrinhoApplication.createCarrinho(carrinho)
    }

    @GetMapping("/{id}")
    fun getCarrinhoById(@PathVariable id: Long): CarrinhoModel {
        return carrinhoApplication.getCarrinhoById(id)
    }

    @GetMapping
    fun getAllCarrinhos(): List<CarrinhoModel> {
        return carrinhoApplication.getAllCarrinho()
    }

    @PutMapping("/{id}")
    fun updateCarrinho(@PathVariable id: Long, @RequestBody carrinho: CarrinhoModel) {
        carrinhoApplication.updateCarrinho( carrinho)
    }

    @DeleteMapping("/{id}")
    fun deleteCarrinho(@PathVariable id: Long) {
        carrinhoApplication.deleteCarrinho(id)
    }
}