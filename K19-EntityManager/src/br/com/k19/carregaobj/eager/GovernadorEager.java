package br.com.k19.carregaobj.eager;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GovernadorEager {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne(mappedBy = "governador")
	private EstadoEager estado;
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoEager getEstado() {
		return estado;
	}

	public void setEstado(EstadoEager estado) {
		this.estado = estado;
	}

}
