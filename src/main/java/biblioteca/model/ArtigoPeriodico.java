package biblioteca.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ArtigoPeriodico extends Publicacao{
	@OneToOne(cascade = {CascadeType.ALL})
	private Periodico periodico;
	private int volume;
	public Periodico getPeriodico() {
		return periodico;
	}
	public void setPeriodico(Periodico periodico) {
		this.periodico = periodico;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
