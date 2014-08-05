package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Editora;

public class Persistindo {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		Editora editora = new Editora();
		editora.setNome("K-19 Livros");
		editora.setEmail("contato@k19.com.br");
		manager.getTransaction().begin();
		manager.persist(editora);
		manager.getTransaction().commit();
	}
}
