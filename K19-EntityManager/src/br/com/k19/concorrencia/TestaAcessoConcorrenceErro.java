package br.com.k19.concorrencia;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaAcessoConcorrenceErro {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager1 = factory.createEntityManager();
		EntityManager manager2 = factory.createEntityManager();
		
		manager1.getTransaction().begin();
		manager2.getTransaction().begin();
		
		ContaConcorrencia conta1 = manager1.find(ContaConcorrencia.class, 1L);
		conta1.setSaldo(conta1.getSaldo() + 500.0);
	
		ContaConcorrencia conta2 = manager2.find(ContaConcorrencia.class, 1L);
		conta2.setSaldo(conta2.getSaldo() - 500.0);
		
		manager1.getTransaction().commit();
		manager2.getTransaction().commit();
		
		manager1.close();
		manager2.close();
		factory.close();
	}

}
