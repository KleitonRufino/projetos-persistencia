package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TesteBuscaFuncionarioDepartamento {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select f.nome, f.departamento.nome from Funcionario f");
		List<Object[]> lista = query.getResultList();
		
		for(Object[] tupla : lista){
			System.out.println("Funcionario: " + tupla[0]);
			System.out.println("Departamento: " + tupla[1]);
		}
		
		manager.close();
		factory.close();
	}
}
