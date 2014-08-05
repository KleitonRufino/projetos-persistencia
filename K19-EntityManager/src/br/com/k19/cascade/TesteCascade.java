package br.com.k19.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteCascade {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		GovernadorCascade governador = new GovernadorCascade();
		governador.setNome("Governador");
		
		EstadoCascade estado = new EstadoCascade();
		estado.setNome("Estado");
		
		governador.setEstado(estado);
		estado.setGovernador(governador);
		
		manager.getTransaction().begin();
		manager.persist(estado);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
