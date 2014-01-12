package biblioteca.dao;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Biblioteca;

public class BibliotecaDao {

	@Inject Session session;
	
	public void adiciona(Biblioteca biblioteca) {
		session.save(biblioteca);
	}

}
