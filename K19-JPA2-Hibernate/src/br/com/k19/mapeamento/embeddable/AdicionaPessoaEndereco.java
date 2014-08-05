package br.com.k19.mapeamento.embeddable;

import java.util.GregorianCalendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaPessoaEndereco {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		EnderecoEmbeddable endereco = new EnderecoEmbeddable();
		endereco.setCidade("Quixada");
		endereco.setEstado("Ceara");
		endereco.setCep(63900130);
		endereco.setLogradouro("Av.: Placido Castelo");
		endereco.setNumero(1943);
		endereco.setComplemento("Apto.:102");
		
		PessoaEmbeddable pessoa = new PessoaEmbeddable();
		pessoa.setNascimento(new GregorianCalendar(1993, 10, 29));
		pessoa.setNome("Kleiton");
		pessoa.setEndereco(endereco);
		
		manager.getTransaction().begin();
		manager.persist(pessoa);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
