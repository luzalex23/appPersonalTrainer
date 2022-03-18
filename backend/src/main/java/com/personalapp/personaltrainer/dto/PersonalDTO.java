package com.personalapp.personaltrainer.dto;

import com.personalapp.personaltrainer.entities.Personal;

public class PersonalDTO {

	private Long id;
	private String nome;
	private String email;
	private String telefone;
	private Long endereco;
	
	public PersonalDTO() {
		
	}

	public PersonalDTO(Long id, String nome, String email, String telefone, Long endereco) {
		this.id = id;
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public PersonalDTO(Personal personal) {
		
	personal.getId();
	personal.getNome();
	personal.getEmail();
	personal.getTelefone();
	personal.getEndereco();
		
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
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

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	
	public Long getEndereco() {
		return endereco;
	}
	
	public void setEndereco(Long endereco) {
		this.endereco = endereco;
	}
}
