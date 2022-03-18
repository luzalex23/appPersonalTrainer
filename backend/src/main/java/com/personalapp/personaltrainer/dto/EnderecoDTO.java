package com.personalapp.personaltrainer.dto;

import com.personalapp.personaltrainer.entities.Endereco;

public class EnderecoDTO {
	
	private Long id;
	private String estado;
	private String cidade;
	private String bairro;
	private String logradouro;
	private String cep;
	
	public EnderecoDTO() {
		
	}

	public EnderecoDTO(Long id, String estado, String cidade, String bairro, String logradouro, String cep) {
		this.id = id;
		this.estado = estado;
		this.cidade = cidade;
		this.bairro = bairro;
		this.logradouro = logradouro;
		this.cep = cep;
	}
	
	public EnderecoDTO(Endereco endereco) {
		
		endereco.getId();
		endereco.getEstado();
		endereco.getCidade();
		endereco.getBairro();
		endereco.getLogradouro();
		endereco.getLogradouro();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getLogradouro() {
		return logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	public String getCep() {
		return cep;
	}

	public void setCep(String cep) {
		this.cep = cep;
	}
	

}
