package com.agendadental.dao;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.agendadental.domain.Paciente;

@Repository
public class PacienteDaoImpl extends AbstractDao<Paciente, Long> implements PacienteDao {

	public List<Paciente> findByNome(String nome) {		
		return createQuery("select p from Paciente p where LOWER(p.nome) like concat('%',?1,'%') ", nome.toLowerCase());
	}

	@Override
	public List<Paciente> findByMes() {
		return createQuery("SELECT p FROM Paciente p WHERE EXTRACT(Month From p.data_nasc)= ?1",LocalDate.now().getMonth().getValue());
	}

	@Override
	public List<Paciente> findByDia() {
		return createQuery("SELECT p FROM Paciente p WHERE EXTRACT(Day From p.data_nasc)= ?1",LocalDate.now().getDayOfMonth());
	}

}
