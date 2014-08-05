package br.com.k19.mapeamaneto.heranca.perclass;

import javax.persistence.Entity;

@Entity
public class PessoaFisicaHerancaPerClass extends PessoaHerancaPerClass{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
