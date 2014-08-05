package br.com.k19.caching;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class InsereCidades {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		CidadeCaching saoPaulo = new CidadeCaching();
		saoPaulo.setNomeDaCidade("Sao Paulo");
		saoPaulo.setNomeDoEstado("Sao Paulo");
		
		CidadeCaching rioDeJaneiro = new CidadeCaching();
		rioDeJaneiro.setNomeDaCidade("Rio de Janeiro");
		rioDeJaneiro.setNomeDoEstado("Rio de Janeiro");
		
		CidadeCaching natal = new CidadeCaching();
		natal.setNomeDaCidade("Natal");
		natal.setNomeDoEstado("Rio Grande do Norte");
		
		manager.persist(saoPaulo);
		manager.persist(rioDeJaneiro);
		manager.persist(natal);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
