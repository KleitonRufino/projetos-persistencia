package br.com.k19.mapeamento.heranca.joined;

import javax.persistence.Entity;

@Entity
public class PessoaJuridicaHerancaJoined extends PessoaHerancaJoined{
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
