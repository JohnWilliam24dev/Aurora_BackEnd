package com.duckers.aurora.Entity
import com.duckers.aurora.Entity.ItemCarrinhoEntity
import java.math.BigDecimal

open class CarrinhoEntity {
    var id: Long? = null
    var cliente: ClienteEntity? = null
    var valorTotal: BigDecimal = BigDecimal.ZERO
    var itens: List<ItemCarrinhoEntity> = mutableListOf()
    constructor()
}