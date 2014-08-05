package br.com.k19.testes;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import br.com.k19.modelo.FuncionarioDepartamento;

public class TesteBuscaFuncionarioDepartamentoII {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Query query = manager.createQuery("select new br.com.k19.modelo.FuncionarioDepartamento(f.nome, f.departamento.nome) from Funcionario f");
		List<FuncionarioDepartamento> lista = query.getResultList();
		
		for(FuncionarioDepartamento fd: lista){
			System.out.println("Funcionario: " + fd.getFuncionario());
			System.out.println("Departamento: " + fd.getDepartamento());
		}
		
		manager.close();
		factory.close();
	}

}
