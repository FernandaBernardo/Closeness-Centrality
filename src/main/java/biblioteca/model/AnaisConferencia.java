package biblioteca.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy=InheritanceType.TABLE_PER_CLASS)
public class AnaisConferencia extends Publicacao {	
	private String editora;
	
	private int numeroVolume;
	
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<ArtigoAnal> artigosAnal;
	
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
	public List<ArtigoAnal> getArtigosAnal() {
		return artigosAnal;
	}
	public void setArtigosAnal(List<ArtigoAnal> artigosAnal) {
		this.artigosAnal = artigosAnal;
	}
	public void addArtigoAnal(ArtigoAnal anal) {
		artigosAnal.add(anal);
	}
}
