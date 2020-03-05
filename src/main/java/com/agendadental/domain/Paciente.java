package com.agendadental.domain;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

@SuppressWarnings("serial")
@Entity
@Table(name = "PACIENTES")
public class Paciente extends AbstractEntity<Long>{
	
	@NotBlank(message = "Informe um nome.")
	@Size(min = 3, max = 50, message = "O nome deve ter entre {min} e {max} caracteres.")
	@Column(name = "nome", nullable = false, length = 50)
	private String nome;
	
	@NotBlank(message = "Informe um Sobrenome.")
	@Size(min = 3, max = 50, message = "O sobrenome deve ter entre {min} e {max} caracteres.")
	@Column(name = "sobrenome", nullable = false, length = 50)
	private String sobrenome;
	
	@Column(name = "email", unique = true, length = 100)
	private String email;	
	
	@DateTimeFormat(iso = ISO.DATE)
	@Column(name = "data_nasc", columnDefinition = "DATE")
	private LocalDate data_nasc;

	@Column(name = "comentario", length = 200)
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
		if(telefone_1.equals("")) {
			telefone_1 = null;
		}
		this.telefone_1 = telefone_1;
	}
	public String getTelefone_2() {		
		return telefone_2;
	}
	public void setTelefone_2(String telefone_2) {
		if(telefone_2.equals("")) {
			telefone_2 = null;
		}
		this.telefone_2 = telefone_2;
	}
	public String getTelefone_3() {
		return telefone_3;
	}
	public void setTelefone_3(String telefone_3) {
		if(telefone_3.equals("")) {
			telefone_3 = null;
		}
		this.telefone_3 = telefone_3;
	}
	
	

}
