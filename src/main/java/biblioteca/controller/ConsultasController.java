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
import biblioteca.model.Biblioteca;
import biblioteca.model.Livro;
import biblioteca.model.Monografia;
import biblioteca.model.Periodico;
import biblioteca.model.Publicacao;
import biblioteca.model.Secao;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Result;

@Controller
public class ConsultasController {
	
	@Inject private PublicacaoDao publicacaoDao;
	@Inject private BibliotecaDao bibliotecaDao;
	@Inject private SecaoDao secaoDao;
	@Inject private PessoaDao pessoaDao;
	@Inject private Result result;
	

	@Get
	public void publicacao() {
	}
	
	@Get
	public void publicacaoTema() {
		List<Publicacao> publicacoes = publicacaoDao.buscaPublicacaoPorTema();
		result.include("publicacoes", publicacoes);
	}
	@Get
	public void publicacaoAutor() {
		List<Publicacao> publicacoes = publicacaoDao.buscaPublicacaoPorAutor();
		result.include("publicacoes", publicacoes);
	}
	@Get
	public void publicacaoTitulo() {
		List<Publicacao> publicacoes = publicacaoDao.buscaPublicacoesPorTitulo();
		result.include("publicacoes", publicacoes);
	}
	@Get
	public void artigo() {
		
	}

	@Get
	public void artigoAnais() {
		List<Publicacao> artigosAnal = publicacaoDao.buscaPublicacoesGenerico(ArtigoAnal.class.getName());
		result.include("artigosAnal", artigosAnal);
	}
	@Get
	public void artigoPeriodico() {
		List<Publicacao> artigosPeriodico = publicacaoDao.buscaPublicacoesGenerico(ArtigoPeriodico.class.getName());
		result.include("artigosPeriodico", artigosPeriodico);
	}
	@Get
	public void artigoLivro() {
		List<Publicacao> artigoLivro = publicacaoDao.buscaPublicacoesGenerico(ArtigoLivro.class.getName());
		result.include("artigoLivro", artigoLivro);
	}
	@Get
	public void artigoTodos() {

	}


	
	@Get
	public void livro() {
		List<Publicacao> livro = publicacaoDao.buscaPublicacoesGenerico(Livro.class.getName());
		result.include("livro", livro);
		
	}
	
	@Get
	public void monografia() {
		List<Publicacao> monografia = publicacaoDao.buscaPublicacoesGenerico(Monografia.class.getName());
		result.include("monografia", monografia);
	}
	
	@Get
	public void periodico() {
		List<Publicacao> periodico = publicacaoDao.buscaPublicacoesGenerico(Periodico.class.getName());
		result.include("periodico", periodico);
	}
	
	@Get
	public void anaisConferencia() {
		List<Publicacao> anaisconferencia = publicacaoDao.buscaPublicacoesGenerico(AnaisConferencia.class.getName());
		result.include("anaisconferencia", anaisconferencia);
	}
	
	@Get
	public void autor() {
		List<Autor> autor = pessoaDao.buscaTodosAutores();
		result.include("autor", autor);
	}
	@Get
	
	public void emprestimo() {
	
	}
	@Get
	public void emprestimoUsuario() {
	
	}
	@Get
	public void emprestimoPublicacao() {
	
	}
	@Get
	public void secao() {
		List<Secao> secao = secaoDao.buscaSecoes();
		result.include("secao", secao);
	}
	@Get
	public void biblioteca() {
		List<Biblioteca> biblioteca = bibliotecaDao.buscaBibliotecas();
		result.include("biblioteca", biblioteca);
	}
	
	@Get
	public void artigoPeriodicoData() {
	}
	
	@Get
	public void data(String dataInicio, String dataFim) throws ParseException {
		List<ArtigoPeriodico> artigos = publicacaoDao.buscaPeriodicoData(parseData(dataInicio), parseData(dataFim));
		result.include("artigos", artigos);
	}
	
	@Get
	public void publicacaoTemaAutor() {
	}
	
	@Get
	public void temaAutor(String tema) {
		List<Publicacao> publicacao = publicacaoDao.buscaPublicacaoPorAutorPorSecao(tema);
		result.include("publicacao", publicacao);
	}
	
	@Get
	public void local() {
	}
	
	@Get
	public void publicacaoLocal(String titulo) {
		Publicacao publicacao = publicacaoDao.buscaPublicacaoPorTitulo(titulo);
		result.include("publicacao", publicacao);
	}
	
	private Calendar parseData(String data) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
		return cal;
	}
	
}
