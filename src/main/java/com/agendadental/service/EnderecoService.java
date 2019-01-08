package com.agendadental.service;

import java.util.List;

import com.agendadental.domain.Endereco;

public interface EnderecoService {
	
	void salvar(Endereco endereco);
	
	void editar(Endereco endereco);
	
	void excluir(Long id);
	
	Endereco buscarPorId(Long id);
	
	List<Endereco> buscarTodos();

}
