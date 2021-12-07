package com.RPG.RPG.Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.validation.constraints.NotNull;


@Entity
public class Itens {

	@GeneratedValue(strategy = GenerationType.IDENTITY) @Id Long idItens;
	@NotNull String nomeDoItem;
	@NotNull String descricaoDoItem;
	@NotNull String peso;
	@NotNull String imgDoItem;
	
	@OneToOne
	@JoinColumn(name = "Personagem_id")
	private Personagem ItemRelacionado;
	
	
	public String getDescricaoDoItem() {
		return descricaoDoItem;
	}
	public void setDescricaoDoItem(String descricaoDoItem) {
		this.descricaoDoItem = descricaoDoItem;
	}
	public String getPeso() {
		return peso;
	}
	public void setPeso(String peso) {
		this.peso = peso;
	}
	public Long getIdItens() {
		return idItens;
	}
	public void setIdItens(Long idItens) {
		this.idItens = idItens;
	}
	public String getNomeDoItem() {
		return nomeDoItem;
	}
	public void setNomeDoItem(String nomeDoItem) {
		this.nomeDoItem = nomeDoItem;
	}
	
	
}
