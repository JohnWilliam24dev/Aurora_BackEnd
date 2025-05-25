package com.duckers.aurora.Model
import jakarta.persistence.*
@Entity
@Table(name = "enderecos")
open class EnderecoModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "endereco_id")
     var id: Int? = null

    @ManyToOne
    @JoinColumn(name = "cliente_id")
     var cliente: ClienteModel? = null

     var rua: String = ""
     var numero: String = ""
     var complemento: String? = null
     var bairro: String = ""
     var cidade: String = ""
     var estado: String = ""
     var cep: String = ""

    constructor()

    constructor(rua: String, numero: String, bairro: String, cidade: String, estado: String, cep: String) {
        this.rua = rua
        this.numero = numero
        this.bairro = bairro
        this.cidade = cidade
        this.estado = estado
        this.cep = cep
    }

    // getters e setters...
}
