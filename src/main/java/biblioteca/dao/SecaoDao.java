package biblioteca.dao;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Secao;

public class SecaoDao {

	@Inject private Session session;

	public void adiciona(Secao secao) {
		session.save(secao);
	}

}
