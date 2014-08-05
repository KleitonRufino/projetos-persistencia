package br.com.k19.testes;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GerarTabela {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory factory = 
				Persistence.createEntityManagerFactory("dev"); 
		factory.close(); 
	}
}
