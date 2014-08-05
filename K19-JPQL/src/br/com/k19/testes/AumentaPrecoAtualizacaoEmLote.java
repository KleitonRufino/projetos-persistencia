package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class AumentaPrecoAtualizacaoEmLote {
	public static void main(String[] args) {
		EntityManagerFactory facoty = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = facoty.createEntityManager();

		manager.getTransaction().begin();

		Query query = manager
				.createQuery("UPDATE Produto p SET p.preco = p.preco * 1.1");
		query.executeUpdate();

		manager.getTransaction().commit();

		manager.close();
		facoty.close();

	}
}
