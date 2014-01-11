package biblioteca.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Monografia extends Publicacao {
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Autor> autores;
	private String nomeInstituicao;
	private int numeroMonografia;
	
	public List<Autor> getAutores() {
		return autores;
	}
	public void setAutores(List<Autor> autores) {
		this.autores = autores;
	}
	public String getNomeInstituicao() {
		return nomeInstituicao;
	}
	public void setNomeInstituicao(String nomeInstituicao) {
		this.nomeInstituicao = nomeInstituicao;
	}
	public int getNumeroMonografia() {
		return numeroMonografia;
	}
	public void setNumeroMonografia(int numeroMonografia) {
		this.numeroMonografia = numeroMonografia;
	}
}
