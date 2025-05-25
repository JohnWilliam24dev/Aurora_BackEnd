package com.duckers.aurora.repository.JPA
import com.duckers.aurora.Model.CarrinhoModel
import org.springframework.data.jpa.repository.JpaRepository;
interface CarrinhoJPA : JpaRepository<CarrinhoModel,Long> {
}