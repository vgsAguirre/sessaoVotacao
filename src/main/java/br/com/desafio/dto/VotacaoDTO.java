package br.com.desafio.dto;

import java.math.BigInteger;
import br.com.desafio.entity.Associado;
import br.com.desafio.entity.Pauta;

public class VotacaoDTO {

	private BigInteger id;
	private String dsVoto;
	private Associado associado;
	private Pauta pauta;

	public VotacaoDTO() {
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public String getDsVoto() {
		return dsVoto;
	}

	public void setDsVoto(String dsVoto) {
		this.dsVoto = dsVoto;
	}

	public Associado getAssociado() {
		return associado;
	}

	public void setAssociado(Associado associado) {
		this.associado = associado;
	}

	public Pauta getPauta() {
		return pauta;
	}

	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}

}
