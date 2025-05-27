package com.duckers.aurora.Entity
import com.duckers.aurora.Enum.Cargo
import java.time.LocalDate

open class FuncionarioEntity {
    var id: Int? = null
    var nomeCompleto: String = ""
    var email: String = ""
    var senha: String = ""
    var cargo: Cargo = Cargo.GERENCIADOR_ROUPAS
    var status: Boolean = true
    constructor()
    constructor(nomeCompleto: String, email: String, senha: String, cargo: Cargo) {
        this.nomeCompleto = nomeCompleto
        this.email = email
        this.senha = senha
        this.cargo = cargo
    }
    enum class Cargo {
        ADMINISTRADOR_GERAL, GERENCIADOR_FUNCIONARIOS, GERENCIADOR_ROUPAS
    }
    // getters e setters...
}
