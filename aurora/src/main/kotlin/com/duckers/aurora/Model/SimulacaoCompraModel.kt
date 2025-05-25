package com.duckers.aurora.Model
import jakarta.persistence.*
import java.math.BigDecimal
import java.time.LocalDate

@Entity
@Table(name = "simulacoes")
open class SimulacaoCompraModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
     var id: Long? = null

    @ManyToOne
    @JoinColumn(name = "cliente_id")
     var cliente: ClienteModel? = null

     var dataSimulacao: LocalDate = LocalDate.now()
     var valorTotal: BigDecimal = BigDecimal.ZERO
     var status: String = ""

    @OneToOne
    @JoinColumn(name = "endereco_id")
     var endereco: EnderecoModel? = null

    @OneToMany(mappedBy = "simulacao", cascade = [CascadeType.PERSIST], orphanRemoval = true)
     var itens: List<ItemSimulacaoModel> = mutableListOf()

    constructor()

    // getters e setters...
}