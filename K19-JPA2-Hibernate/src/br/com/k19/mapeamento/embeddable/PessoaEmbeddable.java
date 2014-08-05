package br.com.k19.mapeamento.embeddable;

import java.util.Calendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class PessoaEmbeddable {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@Temporal(TemporalType.TIMESTAMP)
	private Calendar nascimento;
	//guarda as informacores de Endereco na Tabela Pessoa
	private EnderecoEmbeddable endereco;
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
	public Calendar getNascimento() {
		return nascimento;
	}
	public void setNascimento(Calendar nascimento) {
		this.nascimento = nascimento;
	}
	public EnderecoEmbeddable getEndereco() {
		return endereco;
	}
	public void setEndereco(EnderecoEmbeddable endereco) {
		this.endereco = endereco;
	}
	
}
