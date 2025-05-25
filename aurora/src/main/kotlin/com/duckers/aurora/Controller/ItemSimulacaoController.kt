package com.duckers.aurora.Controller

import com.duckers.aurora.Application.ItemSimulacaoApplication
import com.duckers.aurora.Model.ItemSimulacaoModel

import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/itemSimulacao")
class ItemSimulacaoController(
    private val itemSimulacaoApplication: ItemSimulacaoApplication
) {

    @PostMapping
    fun createItemSimulacao(@RequestBody itemSimulacao: ItemSimulacaoModel) {
        itemSimulacaoApplication.createItemSimulacao(itemSimulacao)
    }

    @GetMapping("/{id}")
    fun getItemSimulacaoById(@PathVariable id: Long): ItemSimulacaoModel {
        return itemSimulacaoApplication.getItemSimulacaoById(id)
    }

    @GetMapping
    fun getAllItemSimulacaos(): List<ItemSimulacaoModel> {
        return itemSimulacaoApplication.getAllItemSimulacao()
    }

    @PutMapping("/{id}")
    fun updateItemSimulacao(@PathVariable id: Long, @RequestBody itemSimulacao: ItemSimulacaoModel) {
        itemSimulacaoApplication.updateItemSimulacao( itemSimulacao)
    }

    @DeleteMapping("/{id}")
    fun deleteItemSimulacao(@PathVariable id: Long) {
        itemSimulacaoApplication.deleteItemSimulacao(id)
    }
}