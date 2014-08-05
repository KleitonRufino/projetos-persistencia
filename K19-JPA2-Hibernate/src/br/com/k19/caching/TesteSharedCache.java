package br.com.k19.caching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteSharedCache {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager1 = factory.createEntityManager();

		System.out.println("---Primeiro Find---");
		CidadeCaching cidade = manager1.find(CidadeCaching.class, 1L);

		EntityManager manager2 = factory.createEntityManager();

		System.out.println("---Segundo Find---");
		cidade = manager2.find(CidadeCaching.class, 1L);
		
	}
}
