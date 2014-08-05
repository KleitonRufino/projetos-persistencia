package br.com.k19.mapeamento.bidirecional;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GovernadorAux {
	@Id
	@GeneratedValue
	private long id;
	private String nome;
	@OneToOne(mappedBy = "governador")
	private EstadoAux estado;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public EstadoAux getEstado() {
		return estado;
	}

	public void setEstado(EstadoAux estado) {
		this.estado = estado;
	}

}
