package com.duckers.aurora.Model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.*
import com.duckers.aurora.Enum.Tamanho

@Entity
class ProdutoTamanhoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    var id: Long = 0

    @Enumerated(EnumType.STRING)
    var tamanho: Tamanho= Tamanho.M

    @ManyToOne
    @JoinColumn(name = "produto_id")
    @JsonIgnore
    var produto: ProdutoModel?=null

}