package com.duckers.aurora.Application

import com.duckers.aurora.Model.ProdutoModel
import com.duckers.aurora.repository.ProdutoRepository

class ProdutoApplication {
    private val produtoRepository: ProdutoRepository;
    constructor(produtoRepository: ProdutoRepository){
        this.produtoRepository=produtoRepository;
    }
    fun createProduto(produtoModel: ProdutoModel){
        produtoRepository.createProduto(produtoModel)

    }
    fun getProdutoById(id:Long): ProdutoModel {
        return produtoRepository.getProdutoById(id)
    }
    fun getAllProduto(): List<ProdutoModel>{
        return produtoRepository.getAllProduto()
    }
    fun updateProduto(produtoModel: ProdutoModel){
        produtoRepository.updateProduto(produtoModel )
    }
    fun deleteProduto(id: Long) {
        produtoRepository.deleteProduto(id)
    }
}