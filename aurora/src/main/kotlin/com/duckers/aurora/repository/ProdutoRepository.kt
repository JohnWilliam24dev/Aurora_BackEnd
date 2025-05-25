package com.duckers.aurora.repository

import com.duckers.aurora.Model.ProdutoModel
import com.duckers.aurora.repository.JPA.ProdutoJPA

class ProdutoRepository {
    private val produtoJPA: ProdutoJPA;
    constructor(produtoJPA: ProdutoJPA){
        this.produtoJPA= produtoJPA;
    }
    fun createProduto(produtoModel: ProdutoModel){
        produtoJPA.save(produtoModel)

    }
    fun getProdutoById(id:Long): ProdutoModel {
        return produtoJPA.findById(id).get()
    }
    fun getAllProduto(): List<ProdutoModel>{
        return produtoJPA.findAll()
    }
    fun updateProduto(produtoModel: ProdutoModel){
        produtoJPA.save(produtoModel)
    }
    fun deleteProduto(id: Long){
        produtoJPA.deleteById(id)
    }
}