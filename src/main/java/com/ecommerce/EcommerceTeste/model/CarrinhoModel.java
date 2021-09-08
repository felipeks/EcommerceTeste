package com.ecommerce.EcommerceTeste.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;


@Entity
@Table(name = "carrinho")
public class CarrinhoModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@ManyToOne(fetch = FetchType.EAGER)
private List<ProdutoModel>  produto;
private CupomModel cupom;
private float valorTotal;
private float  valorDesconto;


}
