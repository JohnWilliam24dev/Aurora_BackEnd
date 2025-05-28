package com.duckers.aurora.Controller

import com.duckers.aurora.Application.ProdutoApplication
import com.duckers.aurora.Model.ProdutoModel
import org.springframework.http.ResponseEntity

import org.springframework.web.bind.annotation.*
import org.springframework.web.multipart.MultipartFile
import java.awt.Image

@RestController
@RequestMapping("/produto")
class ProdutoController(
    private val produtoApplication: ProdutoApplication
) {

    @PostMapping
    fun createProduto(@RequestBody produto: ProdutoModel) {
        produtoApplication.createProduto(produto)
    }

    @GetMapping("/{id}")
    fun getProdutoById(@PathVariable id: Long): ProdutoModel {
        return produtoApplication.getProdutoById(id)
    }

    @GetMapping
    fun getAllProdutos(): List<ProdutoModel> {
        return produtoApplication.getAllProduto()
    }

    @PutMapping("/{id}")
    fun updateProduto(@PathVariable id: Long, @RequestBody produto: ProdutoModel) {
        produtoApplication.updateProduto( produto)
    }

    @DeleteMapping("/{id}")
    fun deleteProduto(@PathVariable id: Long) {
        produtoApplication.deleteProduto(id)
    }
}