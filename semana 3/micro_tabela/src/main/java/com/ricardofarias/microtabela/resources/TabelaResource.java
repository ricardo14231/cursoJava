package com.ricardofarias.microtabela.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardofarias.microtabela.model.TabelaModel;
import com.ricardofarias.microtabela.repository.TabelaRepository;

@RestController
@RequestMapping("tabela")
public class TabelaResource {

	@Autowired
	private TabelaRepository tabelaRepository;
	
	@GetMapping
	public ResponseEntity<List<TabelaModel>> findAllTabela() {
		return ResponseEntity.ok().body(tabelaRepository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<TabelaModel> findByIdTabela(@PathVariable Long id) {
		return ResponseEntity.ok().body(tabelaRepository.findById(id).get());
	}
}
