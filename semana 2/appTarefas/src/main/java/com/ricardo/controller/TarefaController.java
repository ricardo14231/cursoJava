package com.ricardo.controller;

import java.util.Calendar;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardo.model.TarefaModel;
import com.ricardo.repo.TarefaRepository;

@RestController
@RequestMapping(value = "api")
public class TarefaController {

	Calendar c1 = Calendar.getInstance();
	int hora = c1.get(Calendar.HOUR_OF_DAY);
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	@GetMapping
	public List<TarefaModel> findAll() {
		return tarefaRepository.findAll();
	}
	
	@GetMapping(value = "/tarefas")
	public ResponseEntity<List<TarefaModel>> getAll() {
		if(hora > 9 && hora < 17) {
			System.out.println("Entrou, dentro do horário");
			return ResponseEntity.ok(tarefaRepository.findAll());
		} else {
			System.out.println("Fora do horário.");
			return ResponseEntity.noContent().build();
		}
	}
	
	@PostMapping
	public ResponseEntity<TarefaModel> create(@RequestBody TarefaModel tarefa) {
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(tarefaRepository.save(tarefa));
	}
	
	
}
