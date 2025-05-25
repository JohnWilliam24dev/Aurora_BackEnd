package com.duckers.aurora.Model
import jakarta.persistence.*
@Entity
@Table(name = "clientes")
open class ClienteModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cliente_id")
     var id: Int? = null

    @Column(name = "nome_completo", nullable = false)
     var nomeCompleto: String = ""

    @Column(nullable = false, unique = true)
     var email: String = ""

    @Column(nullable = false)
     var senha: String = ""

    @OneToOne(mappedBy = "cliente", cascade = [CascadeType.PERSIST, CascadeType.MERGE])
     var carrinhoModel: CarrinhoModel? = null

    @OneToMany(mappedBy = "cliente", cascade = [CascadeType.PERSIST], orphanRemoval = true)
     var enderecos: List<EnderecoModel> = mutableListOf()

    constructor()

    constructor(nomeCompleto: String, email: String, senha: String) {
        this.nomeCompleto = nomeCompleto
        this.email = email
        this.senha = senha
    }

    // getters e setters...
}
