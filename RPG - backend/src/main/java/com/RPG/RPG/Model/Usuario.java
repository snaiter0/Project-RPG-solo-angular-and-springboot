package com.RPG.RPG.Model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity
public class Usuario {
	
	 @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long idUsuario;
	 
	 String nomeDeUsuario;
	 String senha;
	 String email;
	 LocalDate dataModif = LocalDate.now();
	 
	 @OneToMany(mappedBy = "usuarioRelacionado")
	 private List<Personagem> personagensList;
	 
	public Long getIdUsuario() {
		return idUsuario;
	}
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}
	public String getNomeDeUsuario() {
		return nomeDeUsuario;
	}
	public void setNomeDeUsuario(String nomeDeUsuario) {
		this.nomeDeUsuario = nomeDeUsuario;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	 
	 
	
}
