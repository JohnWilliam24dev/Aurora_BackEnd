package com.duckers.aurora.Model
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "itens_simulacao")
open class ItemSimulacaoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "simulacao_id")
     var simulacao: SimulacaoCompraModel? = null

    @ManyToOne
    @JoinColumn(name = "produto_id")
     var produto: ProdutoModel? = null

     var quantidade: Int = 0
     var precoUnitario: BigDecimal = BigDecimal.ZERO

    constructor(){

    }



}
