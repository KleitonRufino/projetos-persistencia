package br.com.k19.mapeamento.onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionarDepartamentoFuncionarioAux {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		FuncionarioAux funcionario = new FuncionarioAux();
		funcionario.setNome("Jose");
		
		Departamento departamento = new Departamento();
		departamento.setNome("Dep 1");
		departamento.getFuncionarios().add(funcionario);
		
		manager.getTransaction().begin();
		manager.persist(funcionario);
		manager.persist(departamento);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}
}
