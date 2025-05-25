package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.EnderecoModel
import org.springframework.data.jpa.repository.JpaRepository

interface EnderecoJPA: JpaRepository<EnderecoModel,Long> {
}