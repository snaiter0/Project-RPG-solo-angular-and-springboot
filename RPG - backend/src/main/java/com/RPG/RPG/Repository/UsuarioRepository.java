package com.RPG.RPG.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RPG.RPG.Model.Usuario;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	List<Usuario> findAllByNomeDeUsuarioContainingIgnoreCase(String nomeDeUsuario);
}
