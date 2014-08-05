package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class RemoveProdutosRemocaoEmLote {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Query query = manager.createQuery("DELETE Produto p WHERE  p.preco < 50");
		query.executeUpdate();
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
