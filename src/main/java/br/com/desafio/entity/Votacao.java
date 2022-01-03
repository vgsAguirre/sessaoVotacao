package br.com.desafio.entity;

import java.math.BigInteger;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TAB_VOTACAO")
public class Votacao {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private BigInteger id;
	@Column(name = "ds_voto")
	private String dsVoto;

	@ManyToOne
	@JoinColumn(name = "id_associado")
	private Associado associado;
	@ManyToOne
	@JoinColumn(name = "id_pauta")
	private Pauta pauta;

	public Votacao() {
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
