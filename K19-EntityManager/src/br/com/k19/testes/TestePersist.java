package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TestePersist {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		// Abrindo a transacao
		manager.getTransaction().begin();

		// Objeto no estado NEW
		// nao esta associado a um Entity Manager.
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Kleiton");

		// Objeto no estado MANAGED
		// esta associado a um Entity Manager.
		manager.persist(pessoa);
		
		// Sincronizando e Confirmando a transacao
		manager.getTransaction().commit();

		System.out.println("Pessoa id: " + pessoa.getId());

		manager.close();
		factory.close();
	}
}
