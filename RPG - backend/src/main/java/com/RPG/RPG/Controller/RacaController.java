package com.RPG.RPG.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RPG.RPG.Repository.RacasRepository;

@RestController
@RequestMapping("/Racas")
@CrossOrigin("*")
public class RacaController {

	@Autowired RacasRepository repository;

}
