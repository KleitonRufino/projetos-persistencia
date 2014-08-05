package br.com.k19.mapeamento.heranca.single;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

// � Dados Centralizados � os dados est�o em uma �nica tabela, f�cil de
// localizar
// todos os dados;
// � F�cil de entender � um desenvolvedor j�nior poderia facilmente analisar os
// dados, facilita a extra��o de dados via SQL;
// � Boa Performance � tem uma performance boa pois a consulta � realizada
// em apenas uma tabela. � poss�vel tamb�m fazer otimiza��es como cria��o de
// index no banco de dados.
//Nao pode ter campo not null as classes que extenderm desta
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
// @DiscriminatorColumn(name = "pertence_a_classe")
public class PessoaHerancaSingle {
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
