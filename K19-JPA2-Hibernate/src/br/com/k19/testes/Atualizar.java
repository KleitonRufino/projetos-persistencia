package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Editora;

public class Atualizar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = entityManagerFactory.createEntityManager();
		
		manager.getTransaction().begin();
		Editora editora = manager.find(Editora.class, 1L);
		editora.setNome("K19 - Livros e Publicacoes");
		manager.getTransaction().commit();
	}

}
