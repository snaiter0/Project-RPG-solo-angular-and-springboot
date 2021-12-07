package com.RPG.RPG.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RPG.RPG.Model.Usuario;
import com.RPG.RPG.Repository.UsuarioRepository;


@RestController
@RequestMapping("/Usuario")
@CrossOrigin("*")
public class UsuarioController {
	
	@Autowired UsuarioRepository repository;
	
	@GetMapping("/Listar")
	public ResponseEntity<List<Usuario>> getAll()
	{
		return ResponseEntity.status(200).body(repository.findAll());
	}
	
	@PostMapping("/Cadastrar")
	public ResponseEntity<Usuario> registerUser(@RequestBody Usuario UsuarioModel)
	{
		return ResponseEntity.status(201).body(repository.save(UsuarioModel));
	}
	
	@DeleteMapping("/Deletar/{userID}")
	public void  deleteUser (@PathVariable(value = "userID")Long userID)
	{
		repository.deleteById(userID);
	}
	
	
	
}
