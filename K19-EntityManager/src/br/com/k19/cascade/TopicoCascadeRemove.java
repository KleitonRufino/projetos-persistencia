package br.com.k19.cascade;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class TopicoCascadeRemove {
	@Id
	@GeneratedValue
	private Long id;
	// cascadetyperemove = remove comentarios ao apagar topico relacionado a
	// estes
	// orphanremoval = todo comentario nao vinculado a um topcio eh apagado
	// nao eh necessario cascade remove se existir a propriedade orphan
	@OneToMany(cascade = { CascadeType.REMOVE, CascadeType.PERSIST }, orphanRemoval = true)
	private List<ComentarioCascadeRemove> comentarios = new ArrayList<ComentarioCascadeRemove>();
	private String titulo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<ComentarioCascadeRemove> getComentarios() {
		return comentarios;
	}

	public void setComentarios(List<ComentarioCascadeRemove> comentarios) {
		this.comentarios = comentarios;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

}
