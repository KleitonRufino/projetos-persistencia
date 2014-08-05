package br.com.k19.carregaobj.lazy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarregaLazyErro {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		EstadoLazy estado = manager.find(EstadoLazy.class, 1L);
		
		manager.close();
		factory.close();
		
		System.out.println(estado.getGovernador().getNome());
		
	}

}
