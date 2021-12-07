package com.RPG.RPG.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RPG.RPG.Model.Itens;

@Repository
public interface ItensRepository extends JpaRepository<Itens, Long> {

}
