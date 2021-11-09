package com.classes;

import java.util.Collection;

public interface ProdutoService {

	public void createProduto(Produto produto);
	public void deleteProduto(String id);
	public Collection<Produto> getProdutos();
	
}
