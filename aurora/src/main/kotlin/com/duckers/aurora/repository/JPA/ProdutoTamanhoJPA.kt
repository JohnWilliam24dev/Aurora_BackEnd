package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.ProdutoTamanhoModel
import org.springframework.data.jpa.repository.JpaRepository

interface ProdutoTamanhoJPA : JpaRepository<ProdutoTamanhoModel, Long> {
    fun findAllByProdutoId(produtoId: Long): List<ProdutoTamanhoModel>
}
