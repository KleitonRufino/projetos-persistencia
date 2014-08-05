package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.k19.modelo.Produto;

public class TesteConsultaNativas {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		String sql = "SELECT * FROM Produto";
		Query nativeQuery = manager.createNativeQuery(sql, Produto.class);
		List<Produto> produtos = nativeQuery.getResultList();

		for (Produto p : produtos) {
			System.out.println(p.getNome());
		}
	}

}
