package br.com.desafio.dto;

import java.math.BigInteger;
import java.time.LocalDateTime;
import br.com.desafio.entity.Pauta;

public class SessaoDTO {

	private BigInteger id;
	private LocalDateTime tempSessao;
	private Pauta pauta;

	public SessaoDTO() {
		// TODO Auto-generated constructor stub
	}

	public BigInteger getId() {
		return id;
	}

	public void setId(BigInteger id) {
		this.id = id;
	}

	public LocalDateTime getTempSessao() {
		return tempSessao;
	}

	public void setTempSessao(LocalDateTime tempSessao) {
		this.tempSessao = tempSessao;
	}

	public Pauta getPauta() {
		return pauta;
	}

	public void setPauta(Pauta pauta) {
		this.pauta = pauta;
	}

}
