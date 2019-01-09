package com.agendadental.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "PACIENTES")
public class Paciente extends AbstractEntity<Long>{
	
	@Column(name = "nome", nullable = false)
	private String nome;
	@Column(name = "sobrenome", nullable = false)
	private String sobrenome;
	@Column(name = "email", nullable = true, unique = true, length = 100)
	private String email;	
	@Column(name = "sexo", nullable = false, length = 20)
	private String sexo;
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_nasc", nullable = false, columnDefinition = "DATE")
	private LocalDate data_nasc;
	@Column(name = "comentario")
	private String comentario;
	@Column(name = "telefone_1", unique = true)
	private String telefone_1;
	@Column(name = "telefone_2", unique = true)
	private String telefone_2;
	@Column(name = "telefone_3", unique = true)
	private String telefone_3;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco_fk")
	private Endereco endereco;
	

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getComentario() {
		return comentario;
	}
	public void setComentario(String comentario) {
		this.comentario = comentario;
	}
	public LocalDate getData_nasc() {
		return data_nasc;
	}
	public void setData_nasc(LocalDate data_nasc) {
		this.data_nasc = data_nasc;
	}
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getTelefone_1() {
		return telefone_1;
	}
	public void setTelefone_1(String telefone_1) {
		this.telefone_1 = telefone_1;
	}
	public String getTelefone_2() {
		return telefone_2;
	}
	public void setTelefone_2(String telefone_2) {
		this.telefone_2 = telefone_2;
	}
	public String getTelefone_3() {
		return telefone_3;
	}
	public void setTelefone_3(String telefone_3) {
		this.telefone_3 = telefone_3;
	}
	
	

}
