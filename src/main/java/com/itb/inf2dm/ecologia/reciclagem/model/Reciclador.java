package com.itb.inf2dm.ecologia.reciclagem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_reciclador")
public class Reciclador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cep;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private Boolean statuscode= true;
	
	public Reciclador() {
		
	}
	
	public Reciclador(Long id, String cep, String nome, String email, String cpf, String telefone, Boolean statuscode) {
		super();
		this.id = id;
		this.cep = cep;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.telefone = telefone;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Boolean getStatuscode() {
		return statuscode;
	}

	public void setStatuscode(Boolean statuscode) {
		this.statuscode = statuscode;
	}
	
	

	
	
}