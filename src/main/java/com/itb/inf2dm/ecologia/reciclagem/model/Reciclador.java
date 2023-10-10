package com.itb.inf2dm.ecologia.reciclagem.model;





public class Reciclador {
	
	private Long id;
	private String cep;
	private String nome;
	private String email;
	private String cpf;
	private String telefone;
	private boolean codStatusReciclador;
	
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
