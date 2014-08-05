package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TesteFind {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		// Objeto no estado managed
		// esta associado a um Entity Manager
		// A cada sincronizacao o objeto neste estado eh atualizado no bd
		Pessoa pessoa = manager.find(Pessoa.class, 1L);
		System.out.println("Id: " + pessoa.getId());
		System.out.println("Nome: " + pessoa.getNome());

		manager.close();
		factory.close();
	}
}
