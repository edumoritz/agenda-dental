package com.agendadental.domain;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "TELEFONES")
public class Telefone extends AbstractEntity<Long> {
	
	@ManyToOne
	@JoinColumn(name = "id_paciente_fk")
	private Paciente paciente;
	@Column(name = "telefone", unique = true, length = 100)
	private String telefone;
	
	public Paciente getPaciente() {
		return paciente;
	}
	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

}
