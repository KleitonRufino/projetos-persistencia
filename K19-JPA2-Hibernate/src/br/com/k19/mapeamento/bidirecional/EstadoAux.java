package br.com.k19.mapeamento.bidirecional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class EstadoAux {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	@OneToOne
	@JoinColumn(name = "gov_id")
	private GovernadorAux governador;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public GovernadorAux getGovernador() {
		return governador;
	}

	public void setGovernador(GovernadorAux governador) {
		this.governador = governador;
	}

}
