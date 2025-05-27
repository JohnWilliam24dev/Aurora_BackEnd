package com.duckers.aurora.Entity

import java.math.BigDecimal

open class ItemSimulacaoEntity {
    var id: Long? = null
    var simulacao: SimulacaoCompraEntity? = null
    var produto: ProdutoEntity? = null
    var quantidade: Int = 0
    var precoUnitario: BigDecimal = BigDecimal.ZERO
    constructor(){

    }
}
