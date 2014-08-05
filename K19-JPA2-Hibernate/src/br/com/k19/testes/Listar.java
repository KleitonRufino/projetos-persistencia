package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.k19.modelo.Editora;

public class Listar {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();

		Query query = manager.createQuery("SELECT e FROM Editora e");
		List<Editora> editoras = query.getResultList();
		if (editoras != null) {
			System.out.println(editoras.size());
		} else {
			System.out.println("nao encontrado");
		}
	}
}
