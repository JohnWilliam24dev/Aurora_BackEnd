package com.duckers.aurora.repository

import com.duckers.aurora.Model.ProdutoTamanhoModel
import com.duckers.aurora.repository.JPA.ProdutoTamanhoJPA
import org.springframework.stereotype.Repository

@Repository
class ProdutoTamanhoRepository(
    private val produtoTamanhoJPA: ProdutoTamanhoJPA
) {
    fun create(produtoTamanho: ProdutoTamanhoModel) {
        produtoTamanhoJPA.save(produtoTamanho)
    }

    fun getAll(): List<ProdutoTamanhoModel> = produtoTamanhoJPA.findAll()

    fun getByProdutoId(produtoId: Long): List<ProdutoTamanhoModel> =
        produtoTamanhoJPA.findAllByProdutoId(produtoId)

    fun deleteById(id: Long) = produtoTamanhoJPA.deleteById(id)
}
