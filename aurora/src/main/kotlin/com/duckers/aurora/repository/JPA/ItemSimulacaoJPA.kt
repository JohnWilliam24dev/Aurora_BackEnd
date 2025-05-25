package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.ItemSimulacaoModel
import org.springframework.data.jpa.repository.JpaRepository

interface ItemSimulacaoJPA: JpaRepository<ItemSimulacaoModel,Long> {
}