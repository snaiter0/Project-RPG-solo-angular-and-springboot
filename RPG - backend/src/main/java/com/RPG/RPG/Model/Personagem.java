package com.RPG.RPG.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;


@Entity
public class Personagem {

	  //identificacao
	  
	  @GeneratedValue(strategy = GenerationType.IDENTITY) @Id Long idPersonagem;
	  
	  //caracteristicas 
	 @NotNull String nomePersonagem; 
	 @NotNull String raca; 
	 @NotNull Long exp; 
	 @NotNull Long xpProxNv; 
	 @NotNull Long nvl; 
	 @NotNull Long luck; 
	 @NotNull Long temperatura;
	  
	  //imagem do personagem 
	  String imgDoPersonagem;
	  
	  // efeitos 
	  boolean desmaiado,sangrando,exausto,envenenado,alucinando,faminto,hipotermia,
	  hipertermia,caido,imobilizado;
	  
	  //mochila
	  
	  String mochila[];
	  
	  //aliados 
	  String aliados[];
	  
	  @ManyToOne
	  @JoinColumn(name = "personagensList") 
	  private Usuario usuarioRelacionado;
	  
	  @OneToMany(mappedBy = "ItemRelacionado")
	  private List<Itens> itensRelacionadosList;
	   
	  
	public Long getIdPersonagem() {
		return idPersonagem;
	}
		
	public void setIdPersonagem(Long idPersonagem) {
		this.idPersonagem = idPersonagem;
	}	
		
	public String getNomePersonagem() {
		return nomePersonagem;
	}	
		
	public void setNomePersonagem(String nomePersonagem) {
		this.nomePersonagem = nomePersonagem;
	}	
		
	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}

	public Long getExp() {
		return exp;
	}

	public void setExp(Long exp) {
		this.exp = exp;
	}

	public Long getXpProxNv() {
		return xpProxNv;
	}

	public void setXpProxNv(Long xpProxNv) {
		this.xpProxNv = xpProxNv;
	}

	public Long getNvl() {
		return nvl;
	}

	public void setNvl(Long nvl) {
		this.nvl = nvl;
	}

	public Long getLuck() {
		return luck;
	}

	public void setLuck(Long luck) {
		this.luck = luck;
	}

	public Long getTemperatura() {
		return temperatura;
	}

	public void setTemperatura(Long temperatura) {
		this.temperatura = temperatura;
	}

	public String getImgDoPersonagem() {
		return imgDoPersonagem;
	}

	public void setImgDoPersonagem(String imgDoPersonagem) {
		this.imgDoPersonagem = imgDoPersonagem;
	}

	public boolean isDesmaiado() {
		return desmaiado;
	}

	public void setDesmaiado(boolean desmaiado) {
		this.desmaiado = desmaiado;
	} 

	public boolean isSangrando() {
		return sangrando;
	}

	public void setSangrando(boolean sangrando) {
		this.sangrando = sangrando;
	}

	public boolean isExausto() {
		return exausto;
	}

	public void setExausto(boolean exausto) {
		this.exausto = exausto;
	}

	public boolean isEnvenenado() {
		return envenenado;
	}

	public void setEnvenenado(boolean envenenado) {
		this.envenenado = envenenado;
	}

	public boolean isAlucinando() {
		return alucinando;
	}

	public void setAlucinando(boolean alucinando) {
		this.alucinando = alucinando;
	}

	public boolean isFaminto() {
		return faminto;
	}

	public void setFaminto(boolean faminto) {
		this.faminto = faminto;
	}

	public boolean isHipotermia() {
		return hipotermia;
	}

	public void setHipotermia(boolean hipotermia) {
		this.hipotermia = hipotermia;
	}

	public boolean isHipertermia() {
		return hipertermia;
	}

	public void setHipertermia(boolean hipertermia) {
		this.hipertermia = hipertermia;
	}

	public boolean isCaido() {
		return caido;
	}

	public void setCaido(boolean caido) {
		this.caido = caido;
	}

	public boolean isImobilizado() {
		return imobilizado;
	}

	public void setImobilizado(boolean imobilizado) {
		this.imobilizado = imobilizado;
	}

	public String[] getMochila() {
		return mochila;
	}

	public void setMochila(String[] mochila) {
		this.mochila = mochila;
	}

	public String[] getAliados() {
		return aliados;
	}

	public void setAliados(String[] aliados) {
		this.aliados = aliados;
	}
	  
	 
	
}
