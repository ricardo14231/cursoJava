package com.ricardofarias.microcalculadora.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardofarias.microcalculadora.model.CalculadoraModel;
import com.ricardofarias.microcalculadora.services.CalculadoraService;

@RestController
@RequestMapping("/resultado")
public class CalculadoraResources {

	@Autowired
	private CalculadoraService calculadoraService;
	
	@GetMapping("/{tabelaId}/multiplique/{dias}")
	public ResponseEntity<CalculadoraModel> getPayment(@PathVariable Long tabelaId, @PathVariable int dias) {
		return ResponseEntity.ok().body(calculadoraService.getCalculo(tabelaId, dias));
	}
	
}
