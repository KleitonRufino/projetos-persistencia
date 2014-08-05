package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Editora;

public class Buscar {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();
		// recupera imeditamente
		Editora editora = manager.find(Editora.class, 1L);
		// recupera apenas apos um get do obj
		// Editora editora = manager.gerReference(Editora.class, 1L);
		manager.getTransaction().commit();
		if (editora != null) {
			System.out.println(editora.getNome());
		} else {
			System.out.println("nao encontrado");
		}
	}
}
