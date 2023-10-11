package com.itb.inf2dm.ecologia.reciclagem.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tb_recilador")
public class Reciclador {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String cep;
	private String nome;
	private String email;
	private String senha;
	private String cpf;
	private String telefone;
	private boolean codStatusReciclador;
	
	

	
	
	public Reciclador(Long id, String cep, String nome, String email, String senha, String cpf, String telefone,
			boolean codStatusReciclador) {
		this.id = id;
		this.cep = cep;
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.cpf = cpf;
		this.telefone = telefone;
		this.codStatusReciclador = codStatusReciclador;
	}


	public String getSenha() {
		return senha;
	}


	public void setSenha(String senha) {
		this.senha = senha;
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
	public boolean getCodStatusReciclador() {
		return codStatusReciclador;
	}
	public void setCodStatusReciclador(boolean codStatusReciclador) {
		this.codStatusReciclador = codStatusReciclador;
	}
}
