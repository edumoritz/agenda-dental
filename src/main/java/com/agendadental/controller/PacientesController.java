package com.agendadental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.agendadental.domain.Endereco;
import com.agendadental.domain.Paciente;
import com.agendadental.domain.UF;
import com.agendadental.service.PacienteService;

@Controller
@RequestMapping("/pacientes")
public class PacientesController {
	
	@Autowired
	private PacienteService pacienteService;	
	
	@GetMapping("/cadastrar")
	public String cadastrar(Paciente paciente, Endereco endereco) {		
		return "/pacientes/cadastro";
	}
	
	@GetMapping("/listar")
	public String listar(ModelMap model) {
		model.addAttribute("pacientes", pacienteService.buscarTodos());
		return "/pacientes/lista";
	}
	
	@PostMapping("/salvar")
	public String salvar(Paciente paciente, RedirectAttributes attr) {
		pacienteService.salvar(paciente);
		attr.addFlashAttribute("success", "Paciente inserido com sucesso.");
		return "redirect:/pacientes/cadastrar";
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}


}
