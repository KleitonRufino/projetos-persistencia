package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

public class TesteConsultaLivroPrecoMedio {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<Double> query = manager.createQuery("select avg(livro.preco) from Livro livro", Double.class);
		Double  precoMedio = query.getSingleResult();
		
		System.out.println("preco medio: " + precoMedio);
		
		manager.close();
		factory.close();
	}

}
