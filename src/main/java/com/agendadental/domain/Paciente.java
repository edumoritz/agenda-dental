package com.agendadental.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;

@SuppressWarnings("serial")
@Entity
@Table(name = "PACIENTES")
public class Paciente extends AbstractEntity<Long>{
	
	@Column(name = "nome", nullable = false, unique = true)
	private String nome;
	@Column(name = "sobrenome", nullable = false, unique = true)
	private String sobrenome;
	@Column(name = "email", nullable = true, unique = true, length = 100)
	private String email;	
	@Column(name = "sexo", nullable = false, length = 20)
	private String sexo;
	@Column(name = "data_nasc", nullable = false, columnDefinition = "DATE")
	private LocalDate data_nasc;
	@Column(name = "comentario")
	private String comentario;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "id_endereco_fk")
	private Endereco endereco;
	
	@OneToMany(mappedBy = "paciente")
	private List<Telefone> telefones;
	
	public List<Telefone> getTelefones() {
		return telefones;
	}
	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}
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
	
	

}
