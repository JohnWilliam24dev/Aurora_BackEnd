package com.duckers.aurora.Model
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "itens_carrinho")
open class ItemCarrinhoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "carrinho_id")
     var carrinho: CarrinhoModel? = null

    @ManyToOne
    @JoinColumn(name = "produto_id")
     var produto: ProdutoModel? = null

     var quantidade: Int = 0
     var precoUnitario: BigDecimal = BigDecimal.ZERO

    constructor()

    // getters e setters...
}
