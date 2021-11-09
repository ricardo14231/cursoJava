package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.VinhoModel;
import com.example.demo.repository.VinhoRepository;

@RestController
@RequestMapping("/api")
public class VinhoController {

	@Autowired
	private VinhoRepository vinhoRepository;
	
	@GetMapping("/vinhos")
	public ResponseEntity<List<VinhoModel>> listarVinho() {
		return ResponseEntity.ok().body(vinhoRepository.findAll());
	}
}
