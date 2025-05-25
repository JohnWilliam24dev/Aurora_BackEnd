package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.ClienteModel
import org.springframework.data.jpa.repository.JpaRepository

interface ClienteJPA: JpaRepository<ClienteModel,Long> {
}