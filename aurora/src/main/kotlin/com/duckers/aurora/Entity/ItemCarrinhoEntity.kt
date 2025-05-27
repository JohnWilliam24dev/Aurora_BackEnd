package com.duckers.aurora.Entity

import java.math.BigDecimal

open class ItemCarrinhoEntity {
    var id: Long? = null
    var carrinho: CarrinhoEntity? = null
    var produto: ProdutoEntity? = null
    var quantidade: Int = 0
    var precoUnitario: BigDecimal = BigDecimal.ZERO
    constructor()
    // getters e setters...
}
