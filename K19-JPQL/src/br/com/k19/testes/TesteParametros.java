package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.k19.modelo.Livro;

public class TesteParametros {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createNamedQuery("Livro.findByPrecoMinimo");
		query.setParameter("preco", 20.0);
		List<Livro> livros = query.getResultList();

		for (Livro livro : livros) {
			System.out.println("nome: " + livro.getNome());
			System.out.println("preco: " + livro.getPreco());
		}
		manager.close();
		factory.close();
	}

}
