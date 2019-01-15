package com.agendadental.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.agendadental.domain.Paciente;

@Repository
public class PacienteDaoImpl extends AbstractDao<Paciente, Long> implements PacienteDao {

	public List<Paciente> findByNome(String nome) {		
		return createQuery("select p from Paciente p where LOWER(p.nome) like concat('%',?1,'%') ", nome.toLowerCase());
	}

}
