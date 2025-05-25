package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.ProdutoModel
import org.springframework.data.jpa.repository.JpaRepository

interface ProdutoJPA: JpaRepository<ProdutoModel,Long> {

}