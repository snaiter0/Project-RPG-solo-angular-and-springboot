package com.RPG.RPG.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.RPG.RPG.Model.Atributos;
import com.RPG.RPG.Model.Personagem;
import com.RPG.RPG.Repository.AtributosRepository;

@Service
public class AtributosService extends Atributos {

	Atributos atributos = new Atributos();

	@Autowired
	AtributosRepository repository;

	// Aumenta o valor de força do personagem
	public void aumentaFor(@RequestBody Personagem personagemUpdate) {
		atributos.setForca(atributos.getForca() + 1);
	}

	// Aumenta o valor de Destreza do personagem
	public void aumentaDes(@RequestBody Personagem personagemUpdate) {
		atributos.setDestreza(atributos.getDestreza() + 1);
	}

	// Aumenta o valor de Constituicao do personagem
	public void aumentaCons(@RequestBody Personagem personagemUpdate) {
		atributos.setConstituicao(atributos.getConstituicao() + 1);
	}

	// Aumenta o valor de Inteligencia do personagem
	public void aumentaInt(@RequestBody Personagem personagemUpdate) {
		atributos.setInteligencia(atributos.getInteligencia() + 1);
	}

	// Aumenta o valor de Sabedoria do personagem
	public void aumentaSab(@RequestBody Personagem personagemUpdate) {
		atributos.setSabedoria(atributos.getSabedoria() + 1);
	}

	// Aumenta o valor de Carisma do personagem
	public void aumentaCar(@RequestBody Personagem personagemUpdate) {
		atributos.setCarisma(atributos.getCarisma() + 1);
	}

	// Aumenta o valor de Metabolismo do personagem
	public void aumentaMet(@RequestBody Personagem personagemUpdate) {
		atributos.setMetabolismo(atributos.getMetabolismo() + 1);
		System.out.println("Metabolismo aumentou para:"+ getMetabolismo());
	}

	// Aumenta o valor de VidaAtual do personagem
	public void aumentaVidaAtual(@RequestBody Personagem personagemUpdate) {
		atributos.setVidaAtual(atributos.getVidaAtual() + 1);
		System.out.println("Vida Atual aumentou para:"+ getVidaAtual());
	}

	// Aumenta o valor de VidaMax do personagem
	public void aumentaVidaMax(@RequestBody Personagem personagemUpdate) {
		atributos.setVidaMax(atributos.getVidaMax() + 1);
		System.out.println("Vida Max aumentou para:"+ getVidaMax());
	}

	// Aumenta o valor de EnergiaAtual do personagem
	public void aumentaEnergiaAtual(@RequestBody Personagem personagemUpdate) {
		atributos.setEnergiaAtual(atributos.getEnergiaAtual() + 1);
		System.out.println("Energia atual aumentou para:"+ getEnergiaAtual());
	}
	
	// Aumenta o valor de EnergiaMax do personagem
		public void aumentaEnergiaMax(@RequestBody Personagem personagemUpdate) {
			atributos.setEnergiaMax(atributos.getEnergiaMax() + 1);
			System.out.println("Energia Maxima aumentou para:"+ getEnergiaMax());
		}

	// Calcula o valor de Coragem do personagem
	public void aumentaCor(@RequestBody Personagem personagemUpdate) {
		atributos.setCoragem(
				((atributos.getSabedoria() + atributos.getInteligencia() + atributos.getConstituicao()) / 3) - 30);
	}

}
