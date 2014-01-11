package biblioteca.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Biblioteca;
import biblioteca.model.Livro;
import biblioteca.model.Periodico;
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
	
	@SuppressWarnings("unchecked")
	public List<Publicacao> lista() {
		return session.createCriteria(Publicacao.class).list();
	}
	
	public Biblioteca buscaBiblioteca(String biblioteca) {
		Biblioteca result = (Biblioteca)session.createQuery("from Biblioteca b where b.nome=:nome").setString("nome", biblioteca).uniqueResult();
		return result;
	}

	public Secao buscaSecao(String secao) {
		Secao result = (Secao)session.createQuery("from Secao s where s.nome=:nome").setString("nome", secao).uniqueResult();
		return result;
	}

	public Livro buscaLivro(String livro) {
		Livro result = (Livro)session.createQuery("from Livro l where l.titulo=:titulo").setString("titulo", livro).uniqueResult();
		return result;
	}

	public Periodico buscaPeriodico(String periodico) {
		Periodico result = (Periodico)session.createQuery("from Periodico p where p.titulo=:titulo").setString("titulo", periodico).uniqueResult();
		return result;
	}
}
