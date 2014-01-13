package biblioteca.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Secao;

public class SecaoDao {

	@Inject private Session session;

	public void adiciona(Secao secao) {
		session.save(secao);
	}

	public List<Secao> buscaSecoes() {
		return session.createQuery("from Secao").list();
	}

	public Secao buscaSecao(String secao) {
		return (Secao) session.createQuery("from Secao s where s.nome=:nome").setString("nome", secao).uniqueResult();
	}

}
