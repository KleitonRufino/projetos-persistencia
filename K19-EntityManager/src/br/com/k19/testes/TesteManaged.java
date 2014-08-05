package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TesteManaged {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		// Objeto no estado Managed
		// esta associado a um Entity Manager
		// A cada sincronizacao o objeto neste estado eh atualizado no bd
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		// Alterando o conteudo do objeto
		pessoa.setNome("fulano");

		// SINCRONIZANDO E CONFIRMANDO A TRANSACAO
		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}
}
