package com.agendadental.service;

import java.util.List;

import com.agendadental.domain.Telefone;

public interface TelefoneService {
	
	void salvar(Telefone telefone);
	
	void editar(Telefone telefone);
	
	void excluir(Long id);
	
	Telefone buscarPorId(Long id);
	
	List<Telefone> buscarTodos();

}
