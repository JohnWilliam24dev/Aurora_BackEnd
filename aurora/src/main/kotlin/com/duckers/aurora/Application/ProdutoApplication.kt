package com.duckers.aurora.Application

import com.duckers.aurora.Model.ProdutoModel
import com.duckers.aurora.Service.ImageService
import com.duckers.aurora.repository.ProdutoRepository
import org.springframework.stereotype.Service

@Service
class ProdutoApplication(
    private val produtoRepository: ProdutoRepository,
    private val imagemService: ImageService
) {

    fun createProduto(produtoModel: ProdutoModel) {

        produtoRepository.createProduto(produtoModel)


        val id = produtoModel.id
        if (id != null && produtoModel.imagem != null) {
            val caminho = imagemService.salvarImagemBytes(id, produtoModel.imagem!!)
            produtoModel.caminhoImagem = caminho
            produtoRepository.updateProduto(produtoModel)
        }
    }

    fun getProdutoById(id: Long): ProdutoModel {
        val produto = produtoRepository.getProdutoById(id)


        try {
            val imagemBytes = imagemService.carregarImagem(id)
            produto.imagem = imagemBytes
        } catch (e: Exception) {
            produto.imagem = null
        }

        return produto
    }

    fun getAllProduto(): List<ProdutoModel> {
        return produtoRepository.getAllProduto().map { produto ->
            try {
                val imagemBytes = produto.id?.let { imagemService.carregarImagem(it) }
                produto.imagem = imagemBytes
            } catch (e: Exception) {
                produto.imagem = null
            }
            produto
        }
    }

    fun updateProduto(produtoModel: ProdutoModel) {
        val id = produtoModel.id

        if (id != null && produtoModel.imagem != null) {
            val caminho = imagemService.atualizarImagemBytes(id, produtoModel.imagem!!)
            produtoModel.caminhoImagem = caminho
        }

        produtoRepository.updateProduto(produtoModel)
    }

    fun deleteProduto(id: Long) {

        try {
            imagemService.deletarImagem(id)
        } catch (_: Exception) {

        }
        produtoRepository.deleteProduto(id)
    }
}
