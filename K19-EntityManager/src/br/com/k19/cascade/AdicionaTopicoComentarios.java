package br.com.k19.cascade;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaTopicoComentarios {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		TopicoCascadeRemove topico = new TopicoCascadeRemove();
		topico.setTitulo("Titulo");
		for(int i = 0; i < 10; i++){
			ComentarioCascadeRemove comentario = new ComentarioCascadeRemove();
			comentario.setData(Calendar.getInstance());
			topico.getComentarios().add(comentario);
		}
		
		manager.getTransaction().begin();
		manager.persist(topico);
		manager.getTransaction().commit();
		
		factory.close();
	}
}
