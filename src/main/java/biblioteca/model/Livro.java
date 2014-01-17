package biblioteca.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Livro extends Publicacao{
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<Autor> autores;
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<ArtigoLivro> artigosLivro;
	private String tituloOriginal; //opcional
	private String editora;
	private int numeroPaginas; //opcional
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public String getTituloOriginal() {
		return tituloOriginal;
	}
	public void setTituloOriginal(String tituloOriginal) {
		this.tituloOriginal = tituloOriginal;
	}
	public String getEditora() {
		return editora;
	}
	public void setEditora(String editora) {
		this.editora = editora;
	}
	public int getNumeroPaginas() {
		return numeroPaginas;
	}
	public void setNumeroPaginas(int numeroPaginas) {
		this.numeroPaginas = numeroPaginas;
	}
	public List<ArtigoLivro> getArtigosLivro() {
		return artigosLivro;
	}
	public void setArtigosLivro(List<ArtigoLivro> artigosLivro) {
		this.artigosLivro = artigosLivro;
	}
	public void addArtigosLivro(ArtigoLivro artigoLivro) {
		artigosLivro.add(artigoLivro);
	}
}
