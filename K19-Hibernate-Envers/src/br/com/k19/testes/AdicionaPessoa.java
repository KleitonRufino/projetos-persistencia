package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class AdicionaPessoa {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

		Pessoa p = new Pessoa();
		p.setNome("Rafael Cosentino");

		manager.persist(p);

		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
