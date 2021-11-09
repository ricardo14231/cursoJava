package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.ClientesModel;
import com.example.demo.repository.ClientesRepository;

@RestController
@RequestMapping(value = "/api")
public class ClientesController {

	@Autowired
	private ClientesRepository clientesRepository;
	
	@GetMapping("/listar/clientes")
	public List<ClientesModel> findAllClientes() {
		return clientesRepository.findAll();
	}
	
	@PostMapping("/salvar/clientes")
	public ResponseEntity<ClientesModel> salvarCliente(@RequestBody ClientesModel cliente) {
		return ResponseEntity.status(HttpStatus.CREATED).body(clientesRepository.save(cliente));
	}
	
	@GetMapping("/listar/clientes/{tipo}")
	public ResponseEntity<List<ClientesModel>> filtroId(@PathVariable Integer tipo) {
		return ResponseEntity.ok(clientesRepository.procuraTipoCliente(tipo));
	}
	
	@GetMapping("/listar/clientes/sql/alfabetico")
	public List<ClientesModel> procuraTodosAlfabetico() {
		return clientesRepository.procuraTodosAlfabetico();
	}
	
	@GetMapping("/listar/clientes/sql")
	public List<ClientesModel> procuraTodos() {
		return clientesRepository.procuraTodos();
	}
}
