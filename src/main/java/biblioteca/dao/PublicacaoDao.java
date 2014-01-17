package biblioteca.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.AnaisConferencia;
import biblioteca.model.ArtigoAnal;
import biblioteca.model.ArtigoPeriodico;
import biblioteca.model.Autor;
import biblioteca.model.Biblioteca;
import biblioteca.model.Livro;
import biblioteca.model.Periodico;
import biblioteca.model.Publicacao;
import biblioteca.model.Secao;

public class PublicacaoDao {
	@Inject
	private Session session;

	public void adiciona(Publicacao publicacao) {
		session.save(publicacao);
	}
	
	public List<String> secaoPublicacao(){
		return (List<String>) session.createSQLQuery("select * from Secao_Publicacao");
	}

	public Biblioteca buscaBiblioteca(String biblioteca) {
		Biblioteca result = (Biblioteca) session
				.createQuery("from Biblioteca b where b.nome=:nome")
				.setString("nome", biblioteca).uniqueResult();
		return result;
	}

	public Secao buscaSecao(String secao) {
		Secao result = (Secao) session
				.createQuery("from Secao s where s.nome=:nome")
				.setString("nome", secao).uniqueResult();
		return result;
	}

	public Livro buscaLivro(String livro) {
		Livro result = (Livro) session
				.createQuery("from Livro l where l.titulo=:titulo")
				.setString("titulo", livro).uniqueResult();
		return result;
	}

	public Periodico buscaPeriodico(String periodico) {
		Periodico result = (Periodico) session
				.createQuery("from Periodico p where p.titulo=:titulo")
				.setString("titulo", periodico).uniqueResult();
		return result;
	}

	public AnaisConferencia buscaAnaisConferencia(String anal) {
		AnaisConferencia result = (AnaisConferencia) session
				.createQuery("from AnaisConferencia ac where ac.titulo=:titulo")
				.setString("titulo", anal).uniqueResult();
		return result;
	}

	public List<Autor> buscaAutores(String autores) {
		String[] autor = autores.split(",");
		List<Autor> autoresEncontrados = new ArrayList();

		for (String aux : autor) {
			autoresEncontrados.addAll(session
					.createQuery("from Autor a where a.nome =:nome")
					.setString("nome", aux).list());
		}

		return autoresEncontrados;
	}

	public List<Publicacao> buscaTodasPublicacoes() {
		return session.createQuery("from Publicacao").list();
	}

	public List<Publicacao> buscaPublicacoesGenerico(String clazz) {
		return session.createQuery("from " + clazz).list();
	}

	public Publicacao buscaId(Long id) {
		return (Publicacao) session.createQuery("from Publicacao where id=:id")
				.setLong("id", id).uniqueResult();
	}

	public List<ArtigoAnal> buscaArtigos(String artigos) {
		String[] artigo = artigos.split(",");
		List<ArtigoAnal> artigosEncontrados = new ArrayList();

		for (String aux : artigo) {
			artigosEncontrados.addAll(session
					.createQuery("from ArtigoAnal a where a.nome =:nome")
					.setString("nome", aux).list());
		}

		return artigosEncontrados;
	}

	public void atualizaArtigoAnal(ArtigoAnal artigoAnal) {
		session.update(artigoAnal);
	}

	public void atualizaLivro(Livro livro) {
		session.update(livro);
	}

	public void atualizaArtigoPeriodico(ArtigoPeriodico artigoPeriodico) {
		session.update(artigoPeriodico);
	}

	public List<Publicacao> buscaPublicacaoPorAutor() {
		return session.createQuery("select p from Autor a join a.publicacoes p order by a.nome").list();
	}

	public List<Publicacao> buscaPublicacaoPorTema() {
		return session.createQuery("select p from Secao s join s.publicacoes p order by s.nome").list();
	}

	public List<Publicacao> buscaPublicacoesPorTitulo() {
		return session.createQuery("from Publicacao order by titulo").list();
	}
	
	public List<ArtigoPeriodico> buscaPeriodicoData(Calendar anoInicio, Calendar anoFim) {
		return session.createQuery("from ArtigoPeriodico p where p. data between :anoInicio and :anoFim order by p.data")
				.setCalendar("anoInicio", anoInicio)
				.setCalendar("anoFim", anoFim).list();		
	}

	public List<Publicacao> buscaPublicacaoPorAutorPorSecao(String nome) {
		return session.createQuery("select p from Autor a join a.publicacoes p join p.secao s where s.nome = :nome order by a.nome").setString("nome", nome).list();
	}

	public Publicacao buscaPublicacaoPorTitulo(String titulo) {
		return (Publicacao) session.createQuery("from Publicacao p where p.titulo = :titulo order by p.titulo").setString("titulo", titulo).uniqueResult();
	}
	
	
}
