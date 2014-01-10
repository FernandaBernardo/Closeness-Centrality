package biblioteca.model;


import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public abstract class Artigo extends Publicacao{
	@OneToMany
	private List<Autor> autores;
	private String editora;
	private int paginaInicial;
	private int paginaFinal;
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getPaginaInicial() {
		return paginaInicial;
	}
	public void setPaginaInicial(int paginaInicial) {
		this.paginaInicial = paginaInicial;
	}
	public int getPaginaFinal() {
		return paginaFinal;
	}
	public void setPaginaFinal(int paginaFinal) {
		this.paginaFinal = paginaFinal;
	}	
}
