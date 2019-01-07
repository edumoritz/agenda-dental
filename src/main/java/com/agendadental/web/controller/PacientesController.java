package com.agendadental.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/pacientes")
public class PacientesController {
	
	
	@GetMapping("/cadastrar")
	public String cadastrar() {
		return "/pacientes/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar() {
		return "/pacientes/lista";
	}


}
