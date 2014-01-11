package biblioteca.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ArtigoPeriodico {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id; //ADICIONEI ID, VERIFICAR SE CORRETO
	@OneToOne(cascade = {CascadeType.ALL})
	Periodico periodico;
	int volume;
}
