package com.duckers.aurora.Entity

import java.math.BigDecimal
import java.time.LocalDate

open class SimulacaoCompraEntity {
    var id: Long? = null
    var cliente: ClienteEntity? = null
    var dataSimulacao: LocalDate = LocalDate.now()
    var valorTotal: BigDecimal = BigDecimal.ZERO
    var status: String = ""
    var endereco: EnderecoEntity? = null
    var itens: List<ItemSimulacaoEntity> = mutableListOf()
    constructor()
    // getters e setters...
}