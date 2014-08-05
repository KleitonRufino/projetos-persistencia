package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelos.Pessoa;

public class TesteDetached {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		Pessoa pessoa = manager.find(Pessoa.class, 1L);

		// OBJETO NO ESTADO DETACHED
		// DESVINCULA O OBJ DO SEU ENTITY MANAGER
		// O CONTEUDO DO OBJ MODIFICADO NAO SERA SINCRONIZADO NO BD
		manager.detach(pessoa);
		// ALTERANDO O CONTEUDO DO OBJETO
		pessoa.setNome("ciclano");
		// SINCRONIZANDO E CONFIRMANDO A TRANSACAO
		manager.getTransaction().commit();

		manager.close();
		factory.close();
	}

}
