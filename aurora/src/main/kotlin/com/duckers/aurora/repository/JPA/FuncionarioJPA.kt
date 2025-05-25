package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.FuncionarioModel
import org.springframework.data.jpa.repository.JpaRepository

interface FuncionarioJPA: JpaRepository<FuncionarioModel,Long> {
}