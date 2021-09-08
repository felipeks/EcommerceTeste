package com.ecommerce.EcommerceTeste.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produto")
public class ProdutoModel {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private String nome;
private int quantidade;
private float valor;

public ProdutoModel(int id, String nome, int quantidade, float valor) {
	super();
	this.id = id;
	this.nome = nome;
	this.quantidade = quantidade;
	this.valor = valor;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public int getQuantidade() {
	return quantidade;
}

public void setQuantidade(int quantidade) {
	this.quantidade = quantidade;
}

public float getValor() {
	return valor;
}

public void setValor(float valor) {
	this.valor = valor;
}


}
