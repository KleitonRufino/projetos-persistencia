package br.com.k19.mapeamento.enuns;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Turma {
	@Id
	@GeneratedValue
	private long id;
	@Enumerated(EnumType.STRING)
	// colecao de enuns; ex: mais de um papel no sistema
	//@ElementCollection(targetClass = Periodo.class) 
	private Periodo periodo;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Periodo getPeriodo() {
		return periodo;
	}

	public void setPeriodo(Periodo periodo) {
		this.periodo = periodo;
	}

}
