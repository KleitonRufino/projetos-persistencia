package br.com.k19.mapeamento.heranca.joined;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//Asvantagensdessaabordagems�o:
//� TabelaporEntity�essaabordagemcolocacadaentityemumatabelapermi- tindoassimcampos null; 
//� SeguemodeloOO�astabelasser�oreflexodoOOaplicadonasEntities.
//Asdesvantagensseriam:
//� Insertmaiscustoso�uminsertnobancodedadoscustaria�maiscaro�.
//Para persistir a entity PessoaFisica seria necess�rio realizar insert na tabela
//pessoafisica e pessoa; � Alton�merodeJOINS�quantomaiorahierarquia,maior
//o n�mero de joins em uma consulta para trazer a entity do bancodedados.

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class PessoaHerancaJoined {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;

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
}
