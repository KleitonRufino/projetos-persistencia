package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.k19.modelo.Autor;

public class TesteTypedQuery {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		TypedQuery<Autor> query = manager.createNamedQuery("Autor.findAll",
				Autor.class);
		List<Autor> autores = query.getResultList();

		for (Autor autor : autores) {
			System.out.println("autor: " + autor.getNome());
		}
		manager.close();
		factory.close();
	}
}
