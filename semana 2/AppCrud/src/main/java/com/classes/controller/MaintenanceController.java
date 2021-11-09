package com.classes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.classes.model.MaintenanceModel;
import com.classes.repository.MaintenanceRepo;

@RestController
@RequestMapping("api/")
public class MaintenanceController {

	@Autowired
	private MaintenanceRepo repository;
	
	@GetMapping("/list")
	public List<MaintenanceModel> findAllMaintenance( ) {
		return repository.findAll();
	}
	
	@PostMapping("/create")
	public ResponseEntity<MaintenanceModel> save(@RequestBody MaintenanceModel mainTenance) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(mainTenance));
	}
}
