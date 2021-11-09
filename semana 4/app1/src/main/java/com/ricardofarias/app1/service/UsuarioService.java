package com.ricardofarias.app1.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ricardofarias.app1.model.UsuarioModel;
import com.ricardofarias.app1.repository.UsuarioRepository;

@Service
public class UsuarioService {

	@Autowired
	private UsuarioRepository usuarioRepository;
	
	public List<UsuarioModel> getAll() {
		return usuarioRepository.findAll();
	}
	
	public Optional<UsuarioModel> getById(Long id) {
		return usuarioRepository.findById(id);
	}
	
}
