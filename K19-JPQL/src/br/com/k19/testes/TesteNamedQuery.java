package br.com.k19.testes;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import javax.persistence.TypedQuery;

import br.com.k19.modelo.Autor;
import br.com.k19.modelo.Livro;

public class TesteNamedQuery {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		TypedQuery<Autor> query = manager.createNamedQuery("Autor.findAll",
				Autor.class);
		List<Autor> autores = query.getResultList();

		for (Autor autor : autores) {
			System.out.println("Autor: " + autor.getNome());
			Collection<Livro> livros = autor.getLivros();
			for (Livro livro : livros) {
				System.out.println("Livro: " + livro.getNome());
				System.out.println("Pre�o: " + livro.getPreco());
				System.out.println();
			}
			System.out.println();
		}
		manager.close();
		factory.close();
	}

}