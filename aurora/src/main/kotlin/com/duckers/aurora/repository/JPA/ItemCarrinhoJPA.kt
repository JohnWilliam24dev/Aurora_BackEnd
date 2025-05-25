package com.duckers.aurora.repository.JPA

import com.duckers.aurora.Model.ItemCarrinhoModel
import org.springframework.data.jpa.repository.JpaRepository

interface ItemCarrinhoJPA: JpaRepository<ItemCarrinhoModel, Long> {
}