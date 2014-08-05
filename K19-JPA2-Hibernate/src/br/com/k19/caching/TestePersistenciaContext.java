package br.com.k19.caching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class TestePersistenciaContext {
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("---Primeiro Find---");
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		System.out.println("---Segundo Find");
		pessoa = manager.find(Pessoa.class, 1L);
		//so eh realizado uma busca
		//obj fica em cache de primeiro nivel
	}
}
