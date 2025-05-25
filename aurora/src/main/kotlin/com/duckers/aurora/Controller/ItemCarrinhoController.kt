package com.duckers.aurora.Controller

import com.duckers.aurora.Application.ItemCarrinhoApplication
import com.duckers.aurora.Model.ItemCarrinhoModel

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/itemCarrinho")
class ItemCarrinhoController(
    private val itemCarrinhoApplication: ItemCarrinhoApplication
) {

    @PostMapping
    fun createItemCarrinho(@RequestBody itemCarrinho: ItemCarrinhoModel) {
        itemCarrinhoApplication.createItemCarrinho(itemCarrinho)
    }

    @GetMapping("/{id}")
    fun getItemCarrinhoById(@PathVariable id: Long): ItemCarrinhoModel {
        return itemCarrinhoApplication.getItemCarrinhoById(id)
    }

    @GetMapping
    fun getAllItemCarrinhos(): List<ItemCarrinhoModel> {
        return itemCarrinhoApplication.getAllItemCarrinho()
    }

    @PutMapping("/{id}")
    fun updateItemCarrinho(@PathVariable id: Long, @RequestBody itemCarrinho: ItemCarrinhoModel) {
        itemCarrinhoApplication.updateItemCarrinho( itemCarrinho)
    }

    @DeleteMapping("/{id}")
    fun deleteItemCarrinho(@PathVariable id: Long) {
        itemCarrinhoApplication.deleteItemCarrinho(id)
    }
}