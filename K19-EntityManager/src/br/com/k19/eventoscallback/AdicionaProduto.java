package br.com.k19.eventoscallback;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaProduto {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		ProdutoCallBack produto = new ProdutoCallBack();
		produto.setNome("Caneta");
		produto.setPreco(4.56);
		
		manager.getTransaction().begin();
		manager.persist(produto);
		manager.getTransaction().commit();
		
		factory.close();
	}

}
