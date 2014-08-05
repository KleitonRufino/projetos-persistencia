package br.com.k19.mapeamento.heranca.joined;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
//Asvantagensdessaabordagemsão:
//• TabelaporEntity—essaabordagemcolocacadaentityemumatabelapermi- tindoassimcampos null; 
//• SeguemodeloOO—astabelasserãoreflexodoOOaplicadonasEntities.
//Asdesvantagensseriam:
//• Insertmaiscustoso—uminsertnobancodedadoscustaria“maiscaro”.
//Para persistir a entity PessoaFisica seria necessário realizar insert na tabela
//pessoafisica e pessoa; • AltonúmerodeJOINS—quantomaiorahierarquia,maior
//o número de joins em uma consulta para trazer a entity do bancodedados.

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
