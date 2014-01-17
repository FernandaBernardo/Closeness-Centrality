package biblioteca.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class AnaisConferencia extends Publicacao {
	@OneToMany(cascade = {CascadeType.ALL})
	private List<ArtigoAnal> artigoAnal;
	
	private String editora;
	
	private int numeroVolume;
	
	
	public List<ArtigoAnal> getArtigoAnals() {
		return artigoAnal;
	}
	public void setArtigoAnal(List<ArtigoAnal> ArtigoAnals) {
		this.artigoAnal = ArtigoAnals;
	}
	public void addArtigoAnal(ArtigoAnal ArtigoAnal) {
		artigoAnal.add(ArtigoAnal);
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
