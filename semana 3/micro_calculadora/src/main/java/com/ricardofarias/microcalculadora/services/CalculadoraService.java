package com.ricardofarias.microcalculadora.services;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ricardofarias.microcalculadora.model.CalculadoraModel;
import com.ricardofarias.microcalculadora.model.Tabela;

@Service
public class CalculadoraService {

	@Value("${micro_tabela.host}")
	
	private String microTabela;
	
	@Autowired
	private RestTemplate restTemplate;
	
	public CalculadoraModel getCalculo(Long tabelaId, int dias) {
		Map<String, String> urlParamentros = new HashMap<>();

		urlParamentros.put("id", tabelaId.toString());
		
		Tabela tabela = restTemplate.getForObject(microTabela + "/tabela/{id}", Tabela.class , urlParamentros);
		
		return new CalculadoraModel(tabela.getPessoa(), tabela.getPrecoPorDia(), dias);
	}
	
}
