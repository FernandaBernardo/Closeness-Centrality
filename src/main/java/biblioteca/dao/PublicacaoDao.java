package biblioteca.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Livro;
import biblioteca.model.Publicacao;

public class PublicacaoDao {

//	@Inject 
	private Session session;

	public void adicionaLivro(Livro livro) {
		session.save(livro);
	}

	public void adiciona(Publicacao publicacao) {
		session.save(publicacao);
	}

	public void remove(Publicacao publicacao) {
		session.delete(publicacao);
	}

	public void busca(Publicacao publicacao) {
		session.load(Publicacao.class, publicacao.getId());
	}

	@SuppressWarnings("unchecked")
	public List<Publicacao> lista() {
		return session.createCriteria(Publicacao.class).list();
	}
}
