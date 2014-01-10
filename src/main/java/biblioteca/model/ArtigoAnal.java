package biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ArtigoAnal {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id; //ADICIONEI ID, VERIFICAR SE CORRETO
	@OneToOne
	private AnaisConferencia anaisConferencia;
	private int volume;

	public int getId() {
		return id;
	}
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
