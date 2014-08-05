package br.com.k19.carregaobj.lazy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionarGovernadorEstado {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		GovernadorLazy governador = new GovernadorLazy();
		governador.setNome("Governador");
		
		EstadoLazy estado = new EstadoLazy();
		estado.setNome("Estado");
		
		governador.setEstado(estado);
		estado.setGovernador(governador);
		
		manager.persist(estado);
		manager.persist(governador);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
		
	}

}
