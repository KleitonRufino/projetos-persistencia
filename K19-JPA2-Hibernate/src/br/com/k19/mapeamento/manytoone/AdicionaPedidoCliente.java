package br.com.k19.mapeamento.manytoone;

import java.util.Calendar;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class AdicionaPedidoCliente {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("dev");
		EntityManager manager = factory.createEntityManager();
		
		Cliente cliente = new Cliente();
		cliente.setNome("Cliente");
		Pedido pedido = new Pedido();
		pedido.setData(Calendar.getInstance());
		
		manager.getTransaction().begin();
		manager.persist(cliente);
		manager.persist(pedido);
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	}

}
