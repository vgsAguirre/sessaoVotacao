package br.com.desafio.dto;

import java.math.BigInteger;

public class AssociadoDTO {

	private BigInteger id;
	private String cpf;

	public AssociadoDTO() {
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

}
