package br.com.k19.mapeamento.colecao;

import java.util.Collection;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Funcionario {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	@ElementCollection
	private Collection<String> telefones;

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

	public Collection<String> getTelefones() {
		return telefones;
	}

	public void setTelefones(Collection<String> telefones) {
		this.telefones = telefones;
	}

}
