package br.com.k19.carregaobj.eager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EstadoEager {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne
	private GovernadorEager governador;

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

	public GovernadorEager getGovernador() {
		return governador;
	}

	public void setGovernador(GovernadorEager governador) {
		this.governador = governador;
	}

}
