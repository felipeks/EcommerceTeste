package com.ecommerce.EcommerceTeste.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.EcommerceTeste.service.ProdutoService;

@RestController
@RequestMapping(value="/api")
public class ProdutoController {
	
	@Autowired
	ProdutoService produtoService;
	
}
