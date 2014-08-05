package br.com.k19.mapeamento.onetomany;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Departamento {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToMany
	@JoinTable(name = "DEP_FUNC", joinColumns = @JoinColumn(name = "deo_id"), inverseJoinColumns = @JoinColumn(name = "fund_id"))
	private Collection<FuncionarioAux> funcionarios = new ArrayList<FuncionarioAux>();

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

	public Collection<FuncionarioAux> getFuncionarios() {
		return funcionarios;
	}

	public void setFuncionarios(Collection<FuncionarioAux> funcionarios) {
		this.funcionarios = funcionarios;
	}

}
