package br.com.k19.mapeamento.heranca.single;

import javax.persistence.Entity;

@Entity
//@DiscriminatorValue("PessoaFisica")
public class PessoaFisicaHerancaSingle extends PessoaHerancaSingle{
	private String cpf;

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
}
