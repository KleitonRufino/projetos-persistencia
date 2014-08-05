package br.com.k19.carregaobj.lazy;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity

public class EstadoLazy {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne(fetch = FetchType.LAZY)
	private GovernadorLazy governador;

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

	public GovernadorLazy getGovernador() {
		return governador;
	}

	public void setGovernador(GovernadorLazy governador) {
		this.governador = governador;
	}

}
