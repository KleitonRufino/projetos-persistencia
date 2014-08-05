package br.com.k19.cascade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TesteOrphanRemoval {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		TopicoCascadeRemove topico = manager.find(TopicoCascadeRemove.class, 1L);
		//desvinculando os comentarios do topico
		topico.getComentarios().clear();
		
		manager.getTransaction().commit();
		
		factory.close();
	}

}
