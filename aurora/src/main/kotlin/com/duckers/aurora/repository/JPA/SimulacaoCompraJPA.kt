package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.SimulacaoCompraModel
import org.springframework.data.jpa.repository.JpaRepository

interface SimulacaoCompraJPA: JpaRepository<SimulacaoCompraModel,Long> {
}