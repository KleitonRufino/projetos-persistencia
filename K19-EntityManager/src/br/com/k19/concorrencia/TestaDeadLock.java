package br.com.k19.concorrencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.LockModeType;
import javax.persistence.Persistence;


import br.com.k19.eventoscallback.ProdutoCallBack;

public class TestaDeadLock {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager1 = factory.createEntityManager();
		EntityManager manager2 = factory.createEntityManager();
		
		manager1.getTransaction().begin();
		manager2.getTransaction().begin();
		
		manager1.find(ProdutoCallBack.class, 1L, LockModeType.PESSIMISTIC_WRITE);
		System.out.println("Produto 1 travado");
		manager2.find(ProdutoCallBack.class, 1L, LockModeType.PESSIMISTIC_WRITE);
		System.out.println("Essa mensagem nao sera impressa");
		
		manager1.getTransaction().commit();
		manager2.getTransaction().commit();
		
		manager1.close();
		manager2.close();
		
		factory.close();
	}

}
