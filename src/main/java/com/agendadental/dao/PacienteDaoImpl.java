package com.agendadental.dao;

import org.springframework.stereotype.Repository;

import com.agendadental.domain.Paciente;

@Repository
public class PacienteDaoImpl extends AbstractDao<Paciente, Long> implements PacienteDao {

}
