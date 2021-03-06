package com.ricardofarias.app1.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ricardofarias.app1.exceptions.RecursoNaoEncontrado;
import com.ricardofarias.app1.model.UsuarioModel;
import com.ricardofarias.app1.service.UsuarioService;

@RestController
//@RequestMapping
public class UsuarioController {

	@Autowired
    UsuarioService usuarioService;
 
    @GetMapping("usuarios")
    public ResponseEntity<List<UsuarioModel>> getAll() {
        return new ResponseEntity<>(usuarioService.getAll(), HttpStatus.OK);
    }
 
    @GetMapping("usuarios/{id}")
    public ResponseEntity<UsuarioModel> getById(@PathVariable final long id) {
        Optional<UsuarioModel> usuario = usuarioService.getById(id);
        if (usuario.isPresent()) {
            return new ResponseEntity<>(usuario.get(), HttpStatus.OK);
        }
        else {
            throw new RecursoNaoEncontrado();
        }
    }
    
}
