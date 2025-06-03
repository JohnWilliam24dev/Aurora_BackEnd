package com.duckers.aurora.Application

import com.duckers.aurora.Model.ProdutoModel
import com.duckers.aurora.Model.ProdutoTamanhoModel
import com.duckers.aurora.repository.ProdutoRepository
import com.duckers.aurora.repository.ProdutoTamanhoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoTamanhoApplication(
    private val produtoTamanhoRepository: ProdutoTamanhoRepository,
    private val produtoRepository: ProdutoRepository
) {

    fun adicionarTamanho(produtoId: Long, tamanhoModel: ProdutoTamanhoModel) {
        val produto = produtoRepository.getProdutoById(produtoId)
        tamanhoModel.produto = produto
        produtoTamanhoRepository.create(tamanhoModel)
    }

    fun listarTodos(): List<ProdutoTamanhoModel> = produtoTamanhoRepository.getAll()

    fun listarPorProduto(produtoId: Long): List<ProdutoTamanhoModel> =
        produtoTamanhoRepository.getByProdutoId(produtoId)

    fun deletarTamanho(id: Long) = produtoTamanhoRepository.deleteById(id)
}
