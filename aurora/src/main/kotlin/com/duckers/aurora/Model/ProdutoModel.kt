package com.duckers.aurora.Model

import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "produtos")
open class ProdutoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "produto_id")
    var id: Long? = null

    var nome: String = ""
    var descricao: String? = null

    @Column(name = "preco_unitario")
    var precoUnitario: BigDecimal = BigDecimal.ZERO

    var caminhoImagem: String? = null

    @Transient
    var imagem: ByteArray? = null

    var categoria: String = ""

    constructor()

    constructor(nome: String, precoUnitario: BigDecimal, categoria: String) {
        this.nome = nome
        this.precoUnitario = precoUnitario
        this.categoria = categoria
    }
}
