package br.com.k19.testes;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.envers.AuditReader;
import org.hibernate.envers.AuditReaderFactory;
import org.hibernate.envers.query.AuditEntity;
import org.hibernate.envers.query.AuditQuery;

import br.com.k19.modelos.Pessoa;

public class ConsultaPessoa {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence
				.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		AuditReader reader = AuditReaderFactory.get(manager);

		AuditQuery query = reader.createQuery().forEntitiesAtRevision(
				Pessoa.class, 1);
		query.add(AuditEntity.id().eq(1L));

		Pessoa p = (Pessoa) query.getSingleResult();

		System.out.println(p.getNome());

		manager.getTransaction().commit();
		manager.close();
		factory.close();
	}
}
