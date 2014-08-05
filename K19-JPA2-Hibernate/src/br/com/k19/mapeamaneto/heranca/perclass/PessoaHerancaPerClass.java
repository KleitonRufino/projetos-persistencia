package br.com.k19.mapeamaneto.heranca.perclass;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

//A vantagem dessa abordagem é sua melhor performance na hora de retornar uma
//entity,afinal todos os dados de uma entity estão em uma tabela apenas. 
//As desvantagens dessa abordagem são:
//• Colunas repetidas — as colunas das superclasses estarão repetidas nas clas- ses filhas. 
//Em nosso caso, a coluna nome estará repetida nas tabelas pessoa juridica e pessoafisica; 
//• Podegerardiversos UNIONs —se a consulta trouxer todas as Entities da herança um número
//grande de UNION(comandosql)pode ser gerado e atrapalhar a performance do bancodedados.

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class PessoaHerancaPerClass {
	@Id
	//nao podemos usar a geracao automatica de chave
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
