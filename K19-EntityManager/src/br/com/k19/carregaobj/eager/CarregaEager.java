package br.com.k19.carregaobj.eager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarregaEager {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		@SuppressWarnings("unused")
		EstadoEager estado = manager.find(EstadoEager.class, 1L);
		
	}

}
