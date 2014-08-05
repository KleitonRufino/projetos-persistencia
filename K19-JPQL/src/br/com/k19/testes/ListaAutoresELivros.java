package br.com.k19.testes;

import java.util.Collection;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.k19.modelo.Autor;
import br.com.k19.modelo.Livro;

public class ListaAutoresELivros {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		//busca nao otimizada
		//Query query = manager.createQuery("select a from Autor a");
		//busca otimizada 
		Query query = manager.createQuery("select distinct (a) from Autor a left join fetch a.livros");
		
		List<Autor> autores = query.getResultList();
		System.out.println();

		for (Autor autor : autores) {
			System.out.println("autor: " + autor.getNome());
			Collection<Livro> livros = autor.getLivros();
			for (Livro livro : livros) {
				System.out.println("Livro: " + livro.getNome());
			}
			System.out.println();
		}
		manager.close();
		factory.close();
	}

}
