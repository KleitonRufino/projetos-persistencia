package br.com.k19.mapeamaneto.heranca.perclass;

import javax.persistence.Entity;

@Entity
public class PessoaJuridicaHerancaPerClass extends PessoaHerancaPerClass{
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
