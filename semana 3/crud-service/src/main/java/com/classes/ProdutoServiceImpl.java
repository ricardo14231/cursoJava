package com.classes;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Service;

@Service
public class ProdutoServiceImpl implements ProdutoService {

	private static Map<String, Produto> produtoRepository = new HashMap<String, Produto>();
	
	static {
		Produto chocolate = new Produto();
		chocolate.setId("1");
		chocolate.setNome("Chocolate");
		produtoRepository.put(chocolate.getId(), chocolate);
		
		Produto trufa = new Produto();
		trufa.setId("2");
		trufa.setNome("Trufa");
		produtoRepository.put(trufa.getId(), trufa);
	}
	
	@Override
	public void createProduto(Produto produto) {
		produtoRepository.put(produto.getId(), produto);
		
	}

	@Override
	public void deleteProduto(String id) {
		produtoRepository.remove(id);
	}

	@Override
	public Collection<Produto> getProdutos() {
		return produtoRepository.values();
	}

	
}
