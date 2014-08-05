package br.com.k19.mapeamento.manytomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Livro {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@ManyToMany
	@JoinTable(name = "livro_autor", joinColumns = @JoinColumn(name = "livro_id"), inverseJoinColumns = @JoinColumn(name = "autor_id"))
	private Collection<AutorAux> autores = new ArrayList<AutorAux>();

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

	public Collection<AutorAux> getAutores() {
		return autores;
	}

	public void setAutores(Collection<AutorAux> autores) {
		this.autores = autores;
	}

}
