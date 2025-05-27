package com.duckers.aurora.Entity

open class EnderecoEntity {
    var id: Int? = null
    var cliente: ClienteEntity? = null
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
