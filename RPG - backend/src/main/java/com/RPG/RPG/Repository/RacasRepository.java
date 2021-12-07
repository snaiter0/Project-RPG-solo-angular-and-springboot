package com.RPG.RPG.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.RPG.RPG.Model.Racas;


@Repository
public interface RacasRepository extends JpaRepository<Racas, Long> {

}
