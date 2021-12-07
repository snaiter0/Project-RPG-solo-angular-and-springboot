package com.RPG.RPG.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RPG.RPG.Model.Atributos;

@Repository
public interface AtributosRepository extends JpaRepository<Atributos, Long>{

}
