package com.generation.objetivo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

@RequestMapping("/objetivos")

public class ObjetivoController {
	
	@GetMapping
	public String getMentalidadexHabilidade()
	{ 
		return "Objetivos de aprendizagem!";
	}
	
	@GetMapping("/objetivos2")
	public String getDescricao ()
	{ 
		return "Objetivo de aprendizagem para semana serão as aplicações de Spring para web.";
	}

}
