package br.com.k19.carregaobj.eager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionarGovernadorEstado {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		GovernadorEager governador = new GovernadorEager();
		governador.setNome("Governador");
		
		EstadoEager estado = new EstadoEager();
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
