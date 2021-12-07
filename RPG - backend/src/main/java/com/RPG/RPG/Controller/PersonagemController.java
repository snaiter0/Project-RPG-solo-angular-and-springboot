package com.RPG.RPG.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RPG.RPG.Model.Personagem;
import com.RPG.RPG.Repository.PersonagemRepository;

@RestController
@RequestMapping("/Personagens")
@CrossOrigin("*")
public class PersonagemController {

	
	@Autowired PersonagemRepository repository;
	
	
	@GetMapping("/Pesquisar/{nomeDoPersonagem}")
	public ResponseEntity<List<Personagem>> getByName(@PathVariable(value = "nomeDoPersonagem") String nomeDoPersonagem)
	{
		return ResponseEntity.ok().body(repository.findAllByNomePersonagemContainingIgnoreCase(nomeDoPersonagem));
	}
	
	@GetMapping("/Pesquisar/Todos")
	public ResponseEntity<List<Personagem>> findAllCharacters()
	{
		return ResponseEntity.ok().body(repository.findAll());
	}
	
	@PostMapping("/Criar")
	public ResponseEntity<Personagem> newCharacter(@RequestBody Personagem novoPersonagem)
	{
	return ResponseEntity.status(201).body(repository.save(novoPersonagem));
	}
	 
	@PutMapping("/Atualizar/{ID}")
	public ResponseEntity<Personagem> updateCharacter(@RequestBody Personagem novoPersonagem, @PathVariable(value = "ID") Long ID)
	{
		if(repository.findById(ID).isPresent()) {
			novoPersonagem.setIdPersonagem(ID);
			return ResponseEntity.status(201).body(repository.save(novoPersonagem));
		}else
			return ResponseEntity.status(404).build();
	
	}
	
	@DeleteMapping("/Deletar/{ID}")
	public void deleteCharacter(@PathVariable(value = "ID") Long ID)
	{
	 repository.deleteById(ID);
	}
	
	
}
