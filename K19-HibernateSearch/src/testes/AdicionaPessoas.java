package testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.Pessoa;

public class AdicionaPessoas {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Pessoa p1 = new Pessoa();
		p1.setNome("Kleiton");
		
		Pessoa p2 = new Pessoa();
		p2.setNome("Jonas Hirata");
		
		Pessoa p3 = new Pessoa();
		p3.setNome("Marcelo Martins");
		
		Pessoa p4 = new Pessoa();
		p4.setNome("Rafael Cosentino");
		
		manager.persist(p1);
		manager.persist(p2);
		manager.persist(p3);
		manager.persist(p4);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
