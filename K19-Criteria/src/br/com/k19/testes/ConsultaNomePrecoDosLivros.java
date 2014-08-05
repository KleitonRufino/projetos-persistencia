package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import br.com.k19.modelo.Livro;

public class ConsultaNomePrecoDosLivros {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery<Object[]> c = cb.createQuery(Object[].class);
		Root<Livro> l = c.from(Livro.class);
		c.multiselect(l.<String>get("nome"), l.<Double>get("preco"));
		
		TypedQuery<Object[]> query = manager.createQuery(c);
		List<Object[]> resultado = query.getResultList();
		
		for(Object[] registro : resultado){
			System.out.println("Livro: " + registro[0]);
			System.out.println("Preco: " + registro[1]);
		}
		
		manager.close();
		factory.close();
	}

}
