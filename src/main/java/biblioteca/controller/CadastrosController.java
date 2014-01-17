package biblioteca.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import biblioteca.dao.BibliotecaDao;
import biblioteca.dao.PessoaDao;
import biblioteca.dao.PublicacaoDao;
import biblioteca.dao.SecaoDao;
import biblioteca.model.AnaisConferencia;
import biblioteca.model.ArtigoAnal;
import biblioteca.model.ArtigoLivro;
import biblioteca.model.ArtigoPeriodico;
import biblioteca.model.Autor;
import biblioteca.model.Livro;
import biblioteca.model.Monografia;
import biblioteca.model.Periodico;
import biblioteca.model.Secao;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class CadastrosController {
	
	@Inject private PublicacaoDao dao;
	@Inject private Result result;
	@Inject private BibliotecaDao bibliotecadDao;
	@Inject private SecaoDao secaoDao;
	@Inject private PessoaDao pessoaDao;

	@Get
	public void livro() {
	}
	
	@Post
	public void adicionaLivro(String titulo, String data, String local, String biblioteca, String secao, String edicao,
		String autores, String tituloOriginal, String editora, String numeroPaginas) throws ParseException {
		Secao buscaSecao = dao.buscaSecao(secao);
		List<Autor> buscaAutores = dao.buscaAutores(autores);
		Livro livro = new Livro();
		livro.setTitulo(titulo);
		livro.setData(parseData(data));
		livro.setLocal(local);
		livro.setBiblioteca(dao.buscaBiblioteca(biblioteca));
		livro.setSecao(buscaSecao);
		livro.setEdicao(Integer.parseInt(edicao));
		livro.setTituloOriginal(tituloOriginal);
		livro.setEditora(editora);
		livro.setNumeroPaginas(Integer.parseInt(numeroPaginas));
		livro.setAutores(buscaAutores);
		
		dao.adiciona(livro);
		
		for (Autor autor : buscaAutores) {
			autor.addPublicacao(livro);
			pessoaDao.atualiza(autor);
		}
		
		buscaSecao.addPublicacao(livro);
		secaoDao.atualiza(buscaSecao);
		
		result.include("tituloLivro", livro.getTitulo());
	}

	
	@Get
	public void monografia() {
	}
	
	@Post
	public void adicionaMonografia(String titulo, String data, String local, String biblioteca, String secao, String edicao,
			String autores, String nomeInstituicao, String numeroMonografia) throws ParseException {
		Secao buscaSecao = dao.buscaSecao(secao);
		List<Autor> buscaAutores = dao.buscaAutores(autores);
		Monografia monografia = new Monografia();
		monografia.setTitulo(titulo);
		monografia.setData(parseData(data));
		monografia.setLocal(local);
		monografia.setBiblioteca(dao.buscaBiblioteca(biblioteca));
		monografia.setSecao(buscaSecao);
		monografia.setEdicao(Integer.parseInt(edicao));
		monografia.setNomeInstituicao(nomeInstituicao);
		monografia.setNumeroMonografia(Integer.parseInt(numeroMonografia));
		monografia.setAutores(buscaAutores);

		dao.adiciona(monografia);
		
		for (Autor autor : buscaAutores) {
			autor.addPublicacao(monografia);
			pessoaDao.atualiza(autor);
		}

		buscaSecao.addPublicacao(monografia);
		secaoDao.atualiza(buscaSecao);
		
		result.include("tituloMonografia", monografia.getTitulo());
	}
	
	@Get
	public void periodico() {
	}
	
	@Post
	public void adicionaPeriodico(String titulo, String data, String local, String biblioteca, String secao, String edicao,
			String editora) throws ParseException {
		Secao buscaSecao = dao.buscaSecao(secao);
		Periodico periodico = new Periodico();
		periodico.setTitulo(titulo);
		periodico.setData(parseData(data));
		periodico.setLocal(local);
		periodico.setBiblioteca(dao.buscaBiblioteca(biblioteca));
		periodico.setSecao(buscaSecao);
		periodico.setEdicao(Integer.parseInt(edicao));
		periodico.setEditora(editora);

		dao.adiciona(periodico);
		
		buscaSecao.addPublicacao(periodico);
		secaoDao.atualiza(buscaSecao);

		result.include("tituloPeriodico", periodico.getTitulo());
	}
	
	@Get
	public void anaisConferencia() {
	}
	
	@Post
	public void adicionaAnaisConferencia(String titulo, String data, String local, String biblioteca, String secao, String edicao,
			String artigos, String editora, String numeroVolume) throws ParseException {
		Secao buscaSecao = dao.buscaSecao(secao);
		List<ArtigoAnal> buscaArtigos = dao.buscaArtigos(artigos);
		AnaisConferencia anal = new AnaisConferencia();
		anal.setTitulo(titulo);
		anal.setData(parseData(data));
		anal.setLocal(local);
		anal.setBiblioteca(dao.buscaBiblioteca(biblioteca));
		anal.setSecao(buscaSecao);
		anal.setEdicao(Integer.parseInt(edicao));
		anal.setEditora(editora);
		anal.setNumeroVolume(Integer.parseInt(numeroVolume));
		anal.setArtigoAnal(buscaArtigos);

		dao.adiciona(anal);
		
		for (ArtigoAnal artigoAnal : buscaArtigos) {
			artigoAnal.setAnaisConferencia(anal);
			dao.atualizaArtigoAnal(artigoAnal);
		}
		
		buscaSecao.addPublicacao(anal);
		secaoDao.atualiza(buscaSecao);

		result.include("tituloAnal", anal.getTitulo());
	}
	
	@Get
	public void artigoLivro() {
	}
	
	@Post
	public void adicionaArtigoLivro(String titulo, String data, String local, String biblioteca, String secao, String edicao,
			String livro, String numeroCapitulo) throws ParseException {
		Secao buscaSecao = dao.buscaSecao(secao);
		ArtigoLivro artigoLivro = new ArtigoLivro();
		artigoLivro.setTitulo(titulo);
		artigoLivro.setData(parseData(data));
		artigoLivro.setLocal(local);
		artigoLivro.setBiblioteca(dao.buscaBiblioteca(biblioteca));
		artigoLivro.setSecao(buscaSecao);
		artigoLivro.setEdicao(Integer.parseInt(edicao));
		artigoLivro.setLivro(dao.buscaLivro(livro));
		artigoLivro.setNumCapitulo(Integer.parseInt(numeroCapitulo));

		dao.adiciona(artigoLivro);
		
		buscaSecao.addPublicacao(artigoLivro);
		secaoDao.atualiza(buscaSecao);

		result.include("tituloArtigoLivro", artigoLivro.getTitulo());
	}
	
	@Get
	public void artigoPeriodico() {
	}
	
	@Post
	public void adicionaArtigoPeriodico(String titulo, String data, String local, String biblioteca, String secao, String edicao,
			String periodico, String volume, String paginaInicial, String paginaFinal) throws ParseException {
		Secao buscaSecao = dao.buscaSecao(secao);
		ArtigoPeriodico artigoPeriodico = new ArtigoPeriodico();
		artigoPeriodico.setTitulo(titulo);
		artigoPeriodico.setData(parseData(data));
		artigoPeriodico.setLocal(local);
		artigoPeriodico.setBiblioteca(dao.buscaBiblioteca(biblioteca));
		artigoPeriodico.setSecao(buscaSecao);
		artigoPeriodico.setEdicao(Integer.parseInt(edicao));
		artigoPeriodico.setPeriodico(dao.buscaPeriodico(periodico));
		artigoPeriodico.setVolume(Integer.parseInt(volume));
		artigoPeriodico.setPaginaInicial(Integer.parseInt(paginaInicial));
		artigoPeriodico.setPaginaFinal(Integer.parseInt(paginaFinal));

		dao.adiciona(artigoPeriodico);
		
		buscaSecao.addPublicacao(artigoPeriodico);
		secaoDao.atualiza(buscaSecao);

		result.include("tituloArtigoPeriodico", artigoPeriodico.getTitulo());
	}
	
	@Get
	public void artigoAnal() {
	}
	
	@Post
	public void adicionaArtigoAnal(String titulo, String data, String local, String biblioteca, String secao, String edicao,
			String anal, String paginaInicial, String paginaFinal, String volume) throws ParseException {
		Secao buscaSecao = dao.buscaSecao(secao);
		ArtigoAnal artigoAnal = new ArtigoAnal();
		artigoAnal.setTitulo(titulo);
		artigoAnal.setData(parseData(data));
		artigoAnal.setLocal(local);
		artigoAnal.setBiblioteca(dao.buscaBiblioteca(biblioteca));
		artigoAnal.setSecao(buscaSecao);
		artigoAnal.setEdicao(Integer.parseInt(edicao));
		artigoAnal.setAnaisConferencia(dao.buscaAnaisConferencia(anal));
		artigoAnal.setPaginaInicial(Integer.parseInt(paginaInicial));
		artigoAnal.setPaginaFinal(Integer.parseInt(paginaFinal));
		artigoAnal.setVolume(Integer.parseInt(volume));
		
		dao.adiciona(artigoAnal);

		buscaSecao.addPublicacao(artigoAnal);
		secaoDao.atualiza(buscaSecao);

		result.include("tituloArtigoAnal", artigoAnal.getTitulo());
	}
	
	@Get
	public void biblioteca() {
	}

	@Get
	public void secao() {
	}
	
	@Post
	public void adicionaSecao(String nome) {
		Secao secao = new Secao();
		secao.setNome(nome);
		
		secaoDao.adiciona(secao);
		
		result.include("tituloSecao", secao.getNome());
	}

	@Get
	public void autor() {
	}
	
	@Post
	public void adicionaAutor(String nome) {
		Autor autor = new Autor();
		autor.setNome(nome);
		
		pessoaDao.adicionaAutor(autor);
		
		result.include("tituloAutor", autor.getNome());
	}

	private Calendar parseData(String data) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
		return cal;
	}
}
