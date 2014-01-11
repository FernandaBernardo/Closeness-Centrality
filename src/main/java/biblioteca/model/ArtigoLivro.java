package biblioteca.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class ArtigoLivro {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	int id; //ADICIONEI ID, VERIFICAR SE CORRETO
	
	@OneToOne(cascade = {CascadeType.ALL})
	private Livro livro;

	public Livro getLivro() {
		return livro;
	}

	public void setLivro(Livro livro) {
		this.livro = livro;
	}
}
