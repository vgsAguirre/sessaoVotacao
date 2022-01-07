package br.com.desafio.dto;

import java.math.BigInteger;

public class PautaDTO {

	private BigInteger id;
	private String dsAssunto;

	public PautaDTO() {
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDsAssunto() {
		return dsAssunto;
	}

	public void setDsAssunto(String dsAssunto) {
		this.dsAssunto = dsAssunto;
	}

}
