package com.duckers.aurora.Entity

import java.math.BigDecimal
import java.time.LocalDate

open class ProdutoEntity {
    var id: Long? = null
    var nome: String = ""
    var descricao: String? = null
    var precoUnitario: BigDecimal = BigDecimal.ZERO
    var categoria: String = ""
    var imagens: List<String> = mutableListOf()
    constructor()
    constructor(nome: String, precoUnitario: BigDecimal, categoria: String) {
        this.nome = nome
        this.precoUnitario = precoUnitario
        this.categoria = categoria
    }
    // getters e setters...
}
