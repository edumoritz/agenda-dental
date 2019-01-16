package com.agendadental.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/editar/{id}")
	public String preEditar(@PathVariable("id") Long id, ModelMap model) {
		model.addAttribute("paciente", pacienteService.buscarPorId(id));
		return "pacientes/cadastro";
	}
	
	@PostMapping("/editar")
	public String editar(Paciente paciente, RedirectAttributes attr) {
		pacienteService.editar(paciente);
		attr.addFlashAttribute("success", "Paciente editado com sucesso.");
		return "redirect:/pacientes/cadastrar";
	}
	
	@GetMapping("/excluir/{id}")
	public String excluir(@PathVariable("id") Long id, RedirectAttributes attr) {
		pacienteService.excluir(id);
		attr.addFlashAttribute("success", "Paciente excluido com sucesso.");
		return "redirect:/pacientes/listar";
	}
	
	@GetMapping("/buscar/nome")
	public String getPorNome(@RequestParam("nome") String nome, ModelMap model) {		
		model.addAttribute("pacientes", pacienteService.buscarPorNome(nome));
		return "/pacientes/lista";
	}
	
	@GetMapping("/buscar/niver_mes")
	public String getNiverMes(ModelMap model) {	
		model.addAttribute("pacientes", pacienteService.buscarPorNiverMes());
		return "/pacientes/lista";
	}
	
	@GetMapping("/buscar/niver_dia")
	public String getNiverDia(ModelMap model) {	
		model.addAttribute("pacientes", pacienteService.buscarPorNiverDia());
		return "/pacientes/lista";
	}
	
	@ModelAttribute("ufs")
	public UF[] getUFs() {
		return UF.values();
	}


}
