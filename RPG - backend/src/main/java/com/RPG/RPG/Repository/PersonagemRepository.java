package com.RPG.RPG.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RPG.RPG.Model.Personagem;


@Repository
public interface PersonagemRepository extends JpaRepository<Personagem, Long> {

	List<Personagem> findAllByNomePersonagemContainingIgnoreCase(String nomePersonagem);
}
