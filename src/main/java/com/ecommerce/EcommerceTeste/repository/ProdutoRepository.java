package com.ecommerce.EcommerceTeste.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ecommerce.EcommerceTeste.model.ProdutoModel;

public interface ProdutoRepository extends JpaRepository<ProdutoModel, Long> {

}
