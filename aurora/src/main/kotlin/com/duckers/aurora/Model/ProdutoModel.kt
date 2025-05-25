package com.duckers.aurora.Model
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

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

     var categoria: String = ""

    @ElementCollection
    @CollectionTable(name = "produto_imagens", joinColumns = [JoinColumn(name = "produto_id")])
    @Column(name = "url")
     var imagens: List<String> = mutableListOf()

    constructor()

    constructor(nome: String, precoUnitario: BigDecimal, categoria: String) {
        this.nome = nome
        this.precoUnitario = precoUnitario
        this.categoria = categoria
    }

    // getters e setters...
}
