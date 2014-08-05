package br.com.k19.mapeamento.heranca.single;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("PessoaJuridica")
public class PessoaJuridicaHerancaSingle extends PessoaHerancaSingle{
	private String cnpj;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}
