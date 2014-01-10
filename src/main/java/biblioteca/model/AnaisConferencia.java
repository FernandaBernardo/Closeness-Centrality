package biblioteca.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class AnaisConferencia extends Publicacao {
	@OneToMany
	private List<Artigo> artigos;
	
	private String editora;
	
	private int numeroVolume;
	
	
	public List<Artigo> getArtigos() {
		return artigos;
	}
	public void setArtigos(List<Artigo> artigos) {
		this.artigos = artigos;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumeroVolume() {
		return numeroVolume;
	}
	public void setNumeroVolume(int numeroVolume) {
		this.numeroVolume = numeroVolume;
	}
	
}
