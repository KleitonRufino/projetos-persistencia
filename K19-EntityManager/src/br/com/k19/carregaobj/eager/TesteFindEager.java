package br.com.k19.carregaobj.eager;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TesteFindEager {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("-------Chamando o Find----------");
		@SuppressWarnings("unused")
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		System.out.println("-------Fez o Select-------------");
		
		manager.close();
		factory.close();
	}

}
