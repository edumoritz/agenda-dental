package com.agendadental.dao;

import java.util.List;

import com.agendadental.domain.Paciente;

public interface PacienteDao {
	
	void save(Paciente paciente);
	
	void update(Paciente paciente);
	
	void delete(Long id);
	
	Paciente findById(Long id);
	
	List<Paciente> findAll();
	
	public List<Paciente> findByNome(String nome);

	public List<Paciente> findByMes();
	
	public List<Paciente> findByDia();
	
}
