package com.ricardofarias.aula2feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name = "app1", url = "http://localhost:5001/usuario")
public interface UsuarioAula1Feign {
	
	@GetMapping
	public ResponseEntity<List<UsuarioModel>> getAll();
	
}