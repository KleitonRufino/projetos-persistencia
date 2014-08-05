package br.com.k19.mapeamento.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaEstadoGovernador {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Governador governador = new Governador();
		governador.setNome("Governador");
		Estado estado = new Estado();
		estado.setNome("Estado");
		estado.setGovernador(governador);
		
		manager.getTransaction().begin();
		manager.persist(governador);
		manager.persist(estado);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
