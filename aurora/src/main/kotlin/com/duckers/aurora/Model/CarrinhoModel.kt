package com.duckers.aurora.Model
import jakarta.persistence.*
import java.math.BigDecimal

@Entity
@Table(name = "carrinhos")
open class CarrinhoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "carrinho_id")
     var id: Long? = null

    @OneToOne
    @JoinColumn(name = "cliente_id", unique = true)
     var cliente: ClienteModel? = null

    @Column(name = "valor_total")
     var valorTotal: BigDecimal = BigDecimal.ZERO

    @OneToMany(mappedBy = "carrinho", cascade = [CascadeType.PERSIST, CascadeType.MERGE], orphanRemoval = true)
     var itens: List<ItemCarrinhoModel> = mutableListOf()

    constructor()


}
