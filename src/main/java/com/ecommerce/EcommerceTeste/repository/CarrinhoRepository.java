package com.ecommerce.EcommerceTeste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.EcommerceTeste.model.CarrinhoModel;

public interface CarrinhoRepository extends JpaRepository<CarrinhoModel, Integer> {

}
