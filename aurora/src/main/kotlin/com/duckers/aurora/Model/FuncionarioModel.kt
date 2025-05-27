package com.duckers.aurora.Model
import jakarta.persistence.*
import com.duckers.aurora.Enum.Cargo
import java.time.LocalDate

@Entity
@Table(name = "funcionarios")
open class FuncionarioModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "funcionario_id")
     var id: Int? = null

    @Column(name = "nome_completo", nullable = false)
     var nomeCompleto: String = ""

    @Column(nullable = false, unique = true)
     var email: String = ""

    @Column(nullable = false)
     var senha: String = ""
    @Column(nullable = false)
    var cpf: String= ""

    @Enumerated(EnumType.STRING)
     var cargo: Cargo = Cargo.GERENCIADOR_ROUPAS

     var status: Boolean = true

    constructor()

    constructor(nomeCompleto: String, email: String, senha: String, cpf: String, cargo: Cargo) {
        this.nomeCompleto = nomeCompleto
        this.email = email
        this.senha = senha
        this.cpf=cpf
        this.cargo = cargo
    }


    // getters e setters...
}
