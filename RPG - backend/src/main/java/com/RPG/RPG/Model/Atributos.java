package com.RPG.RPG.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;


@Entity
public class Atributos {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) @Id Long idAtributo;
	Long hitDice;
	Long vidaAtual;
	Long vidaMax;
	Long energiaAtual;
	Long energiaMax;
	Long fomeAtual;
	Long fomeMax;
	
	Long forca;
	Long destreza;
	Long Constituicao;
	Long Sabedoria;
	Long Inteligencia;
	Long Carisma;
	Long Metabolismo;
	Long Coragem;
	
	Long pesoMaxPMao;
	Long bloqueio;
	Long esquiva;
	Long percepcaoPassiva;
	Long acertoMagia;
	Long moral;
	

	@OneToOne
	@JoinColumn(name="Personagem_id")
	private Personagem atributoRelacionado;
	
	
	public Long getHitDice() {
		return hitDice;
	}
	
	
	public void setHitDice(Long hitDice) {
		this.hitDice = hitDice;
	}


	public Long getVidaAtual() {
		return vidaAtual;
	}


	public void setVidaAtual(Long vidaAtual) {
		this.vidaAtual = vidaAtual;
	}


	public Long getVidaMax() {
		return vidaMax;
	}


	public void setVidaMax(Long vidaMax) {
		this.vidaMax = vidaMax;
	}


	public Long getEnergiaAtual() {
		return energiaAtual;
	}


	public void setEnergiaAtual(Long energiaAtual) {
		this.energiaAtual = energiaAtual;
	}


	public Long getEnergiaMax() {
		return energiaMax;
	}


	public void setEnergiaMax(Long energiaMax) {
		this.energiaMax = energiaMax;
	}


	public Long getFomeAtual() {
		return fomeAtual;
	}


	public void setFomeAtual(Long fomeAtual) {
		this.fomeAtual = fomeAtual;
	}


	public Long getFomeMax() {
		return fomeMax;
	}


	public void setFomeMax(Long fomeMax) {
		this.fomeMax = fomeMax;
	}


	public Long getForca() {
		return forca;
	}


	public void setForca(Long forca) {
		this.forca = forca;
	}


	public Long getDestreza() {
		return destreza;
	}


	public void setDestreza(Long destreza) {
		this.destreza = destreza;
	}


	public Long getConstituicao() {
		return Constituicao;
	}


	public void setConstituicao(Long constituicao) {
		Constituicao = constituicao;
	}


	public Long getSabedoria() {
		return Sabedoria;
	}


	public void setSabedoria(Long sabedoria) {
		Sabedoria = sabedoria;
	}


	public Long getInteligencia() {
		return Inteligencia;
	}


	public void setInteligencia(Long inteligencia) {
		Inteligencia = inteligencia;
	}


	public Long getCarisma() {
		return Carisma;
	}


	public void setCarisma(Long carisma) {
		Carisma = carisma;
	}


	public Long getMetabolismo() {
		return Metabolismo;
	}


	public void setMetabolismo(Long metabolismo) {
		Metabolismo = metabolismo;
	}


	public Long getCoragem() {
		return Coragem;
	}


	public void setCoragem(Long coragem) {
		Coragem = coragem;
	}


	public Long getPesoMaxPMao() {
		return pesoMaxPMao;
	}


	public void setPesoMaxPMao(Long pesoMaxPMao) {
		this.pesoMaxPMao = pesoMaxPMao;
	}


	public Long getBloqueio() {
		return bloqueio;
	}


	public void setBloqueio(Long bloqueio) {
		this.bloqueio = bloqueio;
	}


	public Long getEsquiva() {
		return esquiva;
	}


	public void setEsquiva(Long esquiva) {
		this.esquiva = esquiva;
	}


	public Long getPercepcaoPassiva() {
		return percepcaoPassiva;
	}


	public void setPercepcaoPassiva(Long percepcaoPassiva) {
		this.percepcaoPassiva = percepcaoPassiva;
	}


	public Long getAcertoMagia() {
		return acertoMagia;
	}


	public void setAcertoMagia(Long acertoMagia) {
		this.acertoMagia = acertoMagia;
	}


	public Long getMoral() {
		return moral;
	}


	public void setMoral(Long moral) {
		this.moral = moral;
	}


	public Long getIdAtributo() {
		return idAtributo;
	}


	public void setIdAtributo(Long idAtributo) {
		this.idAtributo = idAtributo;
	}

	
	
}
