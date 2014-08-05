package br.com.k19.cascade;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class EstadoCascade {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	// cascadetypepersist = persiste tambem a relacao ao persistir so o estado
	@OneToOne(cascade = CascadeType.PERSIST, fetch = FetchType.LAZY)
	private GovernadorCascade governador;

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

	public GovernadorCascade getGovernador() {
		return governador;
	}

	public void setGovernador(GovernadorCascade governador) {
		this.governador = governador;
	}

}
