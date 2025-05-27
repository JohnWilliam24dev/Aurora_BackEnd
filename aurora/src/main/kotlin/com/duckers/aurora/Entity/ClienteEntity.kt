package com.duckers.aurora.Entity

open class ClienteEntity {
    var id: Int? = null
    var nomeCompleto: String = ""
    var email: String = ""
    var senha: String = ""
    var carrinhoEntity: CarrinhoEntity? = null
    var enderecos: List<EnderecoEntity> = mutableListOf()
    constructor()
    constructor(nomeCompleto: String, email: String, senha: String) {
        this.nomeCompleto = nomeCompleto
        this.email = email
        this.senha = senha
    }
    // getters e setters...
}
