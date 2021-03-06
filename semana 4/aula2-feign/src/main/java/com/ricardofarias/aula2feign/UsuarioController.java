package com.ricardofarias.aula2feign;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping
public class UsuarioController {

	@Autowired
	UsuarioAula1Feign usuarioAula1Feign;
	
	@GetMapping("hello")
	public String testar() {
		return "Hello";
	}
	
	@GetMapping
	public ResponseEntity<ResponseEntity<List<UsuarioModel>>> getTodos() {
		return ResponseEntity.ok(usuarioAula1Feign.getAll());
	}
	
	@GetMapping("/listar/body")
	public ResponseEntity<List<UsuarioModel>> getTodosBody() {
		return ResponseEntity.ok(usuarioAula1Feign.getAll().getBody());
	}
	
}
