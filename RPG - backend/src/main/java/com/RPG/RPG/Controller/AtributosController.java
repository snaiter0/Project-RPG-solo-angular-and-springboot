package com.RPG.RPG.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.RPG.RPG.Repository.AtributosRepository;
import com.RPG.RPG.Service.AtributosService;

@RestController
@RequestMapping("/Atributos")
@CrossOrigin("*")
public class AtributosController {

	@Autowired AtributosRepository repository;
	@Autowired AtributosService service;
	
	
	
}
