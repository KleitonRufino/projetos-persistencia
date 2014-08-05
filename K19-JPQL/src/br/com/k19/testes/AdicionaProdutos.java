package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Produto;

public class AdicionaProdutos {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		for(int i=0; i < 100; i++){
			Produto produto = new Produto();
			produto.setNome("produto "+ i );
			produto.setPreco(i * 10.0);
			manager.persist(produto);
		}
	
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
