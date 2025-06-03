package com.duckers.aurora.Controller

import com.duckers.aurora.Application.ProdutoTamanhoApplication
import com.duckers.aurora.Model.ProdutoTamanhoModel
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/produto-tamanho")
class ProdutoTamanhoController(
    private val produtoTamanhoApplication: ProdutoTamanhoApplication
) {

    @PostMapping("/{produtoId}")
    fun adicionarTamanho(
        @PathVariable produtoId: Long,
        @RequestBody tamanho: ProdutoTamanhoModel
    ) {
        produtoTamanhoApplication.adicionarTamanho(produtoId, tamanho)
    }

    @GetMapping
    fun listarTodos(): List<ProdutoTamanhoModel> = produtoTamanhoApplication.listarTodos()

    @GetMapping("/produto/{produtoId}")
    fun listarPorProduto(@PathVariable produtoId: Long): List<ProdutoTamanhoModel> =
        produtoTamanhoApplication.listarPorProduto(produtoId)

    @DeleteMapping("/{id}")
    fun deletar(@PathVariable id: Long) {
        produtoTamanhoApplication.deletarTamanho(id)
    }
}
