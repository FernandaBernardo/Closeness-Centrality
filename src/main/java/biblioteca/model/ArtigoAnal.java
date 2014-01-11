package biblioteca.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToOne;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class ArtigoAnal extends Publicacao{
	@OneToOne(cascade = {CascadeType.ALL})
	private AnaisConferencia anaisConferencia;
	private int volume;

	public AnaisConferencia getAnaisConferencia() {
		return anaisConferencia;
	}
	public void setAnaisConferencia(AnaisConferencia anaisConferencia) {
		this.anaisConferencia = anaisConferencia;
	}
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
}
