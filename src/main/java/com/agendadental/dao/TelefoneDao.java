package com.agendadental.dao;

import java.util.List;

import com.agendadental.domain.Telefone;

public interface TelefoneDao {

	void save(Telefone telefone);
	
	void update(Telefone telefone);
	
	void delete(Long id);
	
	Telefone findById(Long id);
	
	List<Telefone> findAll();
}
