package biblioteca.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Biblioteca;

public class BibliotecaDao {

	@Inject Session session;
	
	public void adiciona(Biblioteca biblioteca) {
		session.save(biblioteca);
	}

	public List<Biblioteca> buscaBibliotecas() {
		return session.createQuery("from Biblioteca").list();
	}

	public Biblioteca buscaBiblioteca(String biblioteca) {
		return (Biblioteca) session.createQuery("from Biblioteca b where b.nome=:nome")
				.setString("nome", biblioteca).uniqueResult();
	}

	public void atualizaBiblioteca(Biblioteca biblio) {
		session.update(biblio);
	}

}
