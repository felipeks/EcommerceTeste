package com.ecommerce.EcommerceTeste.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity
@Table(name = "carrinho")
public class CarrinhoModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.PERSIST )
private List<ProdutoModel>  produtos = new ArrayList<ProdutoModel>();

@OneToOne(fetch = FetchType.EAGER)
private CupomModel cupom;
private float valorTotal;
private float  valorDesconto;


}
