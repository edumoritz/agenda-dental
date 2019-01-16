package com.agendadental.service;

import java.util.List;

import com.agendadental.domain.Paciente;

public interface PacienteService {

	void salvar(Paciente paciente);
	
	void editar(Paciente paciente);
	
	void excluir(Long id);
	
	Paciente buscarPorId(Long id);
	
	List<Paciente> buscarTodos();
	
	List<Paciente> buscarPorNome(String nome);
	
	List<Paciente> buscarPorNiverMes();
	
	List<Paciente> buscarPorNiverDia();
	
}
