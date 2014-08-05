package br.com.k19.carregaobj.lazy;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TesteLazyInitialization {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		//Objeto  carregado em modo lazy
		Pessoa pessoa = manager.getReference(Pessoa.class, 1L);
		
		manager.close();
		factory.close();
		
		//Tenta usar um dado de um objeto
		System.out.println(pessoa.getNome());
	}

}
