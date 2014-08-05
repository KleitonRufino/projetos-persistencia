package br.com.k19.carregaobj.lazy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TesteGetReferenceLazy {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		System.out.println("--------------Chamando o Get Reference-------------");
		@SuppressWarnings("unused")
		Pessoa pessoa = manager.getReference(Pessoa.class, 1L);
		System.out.println("--------------Nao fez o Select---------------------");
		
		manager.close();
		factory.close();
	}

}
