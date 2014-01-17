package biblioteca.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Periodico extends Publicacao {
	private String editora;
	@ManyToMany(cascade = {CascadeType.ALL})
	private List<ArtigoPeriodico> artigosPeriodico;

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public List<ArtigoPeriodico> getArtigosPeriodico() {
		return artigosPeriodico;
	}

	public void setArtigosPeriodico(List<ArtigoPeriodico> artigosPeriodico) {
		this.artigosPeriodico = artigosPeriodico;
	}
	
	public void addArtigoPeriodico(ArtigoPeriodico artigoPeriodico) {
		artigosPeriodico.add(artigoPeriodico);
	}
}
