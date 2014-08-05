package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.k19.modelo.Departamento;
import br.com.k19.modelo.Funcionario;

public class AdicionaFuncionarioDepartamento {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Departamento departamento = new Departamento();
		departamento.setNome("Treinamentos");
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Kleiton");
		funcionario.setDepartamento(departamento);
		
		manager.persist(departamento);
		manager.persist(funcionario);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
