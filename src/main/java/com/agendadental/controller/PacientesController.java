package com.agendadental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.agendadental.domain.Endereco;
import com.agendadental.domain.Paciente;
import com.agendadental.domain.Telefone;
import com.agendadental.service.PacienteService;

@Controller
@RequestMapping("/pacientes")
public class PacientesController {
	
	@Autowired
	private PacienteService pacienteService;	
	
	@GetMapping("/cadastrar")
	public String cadastrar(Paciente paciente, Telefone telefone, Endereco endereco) {
		
		return "/pacientes/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pacientes", pacienteService.buscarTodos());
		return "/pacientes/lista";
	}


}
