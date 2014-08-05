package br.com.k19.cascade;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GovernadorCascade {
	@Id
	@GeneratedValue
	private Long id;
	private String nome;
	@OneToOne(mappedBy = "governador")
	private EstadoCascade estado;
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
	public EstadoCascade getEstado() {
		return estado;
	}
	public void setEstado(EstadoCascade estado) {
		this.estado = estado;
	}
}
