package biblioteca.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Biblioteca;
import biblioteca.model.Publicacao;
import biblioteca.model.Secao;

public class PublicacaoDao{

	@Inject private Session session;

	public void adiciona(Publicacao publicacao) {
		session.save(publicacao);
	}

	public void remove(Publicacao publicacao) {
		session.delete(publicacao);
	}

	public void busca(Publicacao publicacao) {
		session.load(Publicacao.class, publicacao.getId());
	}
	
	public Biblioteca buscaBiblioteca(String biblioteca) {
		Biblioteca result = (Biblioteca)session.createQuery("from Biblioteca b where b.nome=:nome").setString("nome", biblioteca).uniqueResult();
		return result;
	}

	@SuppressWarnings("unchecked")
	public List<Publicacao> lista() {
		return session.createCriteria(Publicacao.class).list();
	}

	public Secao buscaSecao(String secao) {
		Secao result = (Secao)session.createQuery("from Secao s where s.nome=:nome").setString("nome", secao).uniqueResult();
		return result;
	}
}
