package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import br.com.k19.modelo.Livro;

public class TesteBuscaPaginadaCarregaQtdObjEspecificada {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		TypedQuery<Livro> query = manager.createQuery("select livro from Livro livro", Livro.class);
		
		query.setFirstResult(2);
		query.setMaxResults(3);
		
		List<Livro> livros = query.getResultList();
		for(Livro livro : livros){
			System.out.println("livro: " + livro.getNome());
		}
		manager.close();
		factory.close();
	}

}