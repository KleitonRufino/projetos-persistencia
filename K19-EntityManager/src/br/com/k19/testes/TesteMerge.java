package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TesteMerge {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		// OBJETO NO ESTADO MANAGED
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		// OBJETO NO ESTADO DETACHED
		manager.detach(pessoa);
		// OBJETO NO ESTADO MANAGED
		Pessoa pessoa2 = manager.merge(pessoa);
		// ALTERANDO O CONTEUDO DO OBJETO
		pessoa2.setNome("ciclano");
		// SINCRONIZANDO E CONFIRMANDO A TRANSACAO
		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

}
