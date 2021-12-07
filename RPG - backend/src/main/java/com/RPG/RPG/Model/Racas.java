package com.RPG.RPG.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Racas {
	
	@GeneratedValue(strategy = GenerationType.IDENTITY) @Id Long idRaca;
	
	//racas
	@NotBlank boolean elfo, skarvan, deara, caspite, humano, rakshasa,
	lobisomen, reaper, lizardman;

	public Long getIdRaca() {
		return idRaca;
	}

	public void setIdRaca(Long idRaca) {
		this.idRaca = idRaca;
	}

	public boolean isElfo() {
		return elfo;
	}

	public void setElfo(boolean elfo) {
		this.elfo = elfo;
	}

	public boolean isSkarvan() {
		return skarvan;
	}

	public void setSkarvan(boolean skarvan) {
		this.skarvan = skarvan;
	}

	public boolean isDeara() {
		return deara;
	}

	public void setDeara(boolean deara) {
		this.deara = deara;
	}

	public boolean isCaspite() {
		return caspite;
	}

	public void setCaspite(boolean caspite) {
		this.caspite = caspite;
	}

	public boolean isHumano() {
		return humano;
	}

	public void setHumano(boolean humano) {
		this.humano = humano;
	}

	public boolean isRakshasa() {
		return rakshasa;
	}

	public void setRakshasa(boolean rakshasa) {
		this.rakshasa = rakshasa;
	}

	public boolean isLobisomen() {
		return lobisomen;
	}

	public void setLobisomen(boolean lobisomen) {
		this.lobisomen = lobisomen;
	}

	public boolean isReaper() {
		return reaper;
	}

	public void setReaper(boolean reaper) {
		this.reaper = reaper;
	}

	public boolean isLizardman() {
		return lizardman;
	}

	public void setLizardman(boolean lizardman) {
		this.lizardman = lizardman;
	}
	
	

}
