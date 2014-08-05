package br.com.k19.mapeamento.heranca.joined;

import javax.persistence.Entity;

@Entity
public class PessoaFisicaHerancaJoined extends PessoaHerancaJoined{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
