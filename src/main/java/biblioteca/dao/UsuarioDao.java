package biblioteca.dao;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Usuario;

public class UsuarioDao {

	@Inject private Session session;
	
	public void adiciona(Usuario usuario) {
		session.save(usuario);
	}
	
}
