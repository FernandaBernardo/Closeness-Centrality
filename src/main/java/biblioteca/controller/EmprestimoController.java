package biblioteca.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import biblioteca.dao.PessoaDao;
import biblioteca.dao.PublicacaoDao;
import biblioteca.model.AnaisConferencia;
import biblioteca.model.ArtigoAnal;
import biblioteca.model.ArtigoLivro;
import biblioteca.model.ArtigoPeriodico;
import biblioteca.model.Emprestimo;
import biblioteca.model.Livro;
import biblioteca.model.Monografia;
import biblioteca.model.Periodico;
import biblioteca.model.Publicacao;
import biblioteca.model.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.hibernate.extra.Load;
import br.com.caelum.vraptor.interceptor.IncludeParameters;

@Controller
public class EmprestimoController {
	
	@Inject private PublicacaoDao publicacaoDao;
	@Inject private PessoaDao pessoaDao;
	@Inject private Result result;
	
	@Get
	public void livro() {
		List<Publicacao> livros = publicacaoDao.buscaPublicacoesGenerico(Livro.class.getName());
		result.include("livros", livros);
	}
	
	@Get
	public void monografia() {
		List<Publicacao> monografias = publicacaoDao.buscaPublicacoesGenerico(Monografia.class.getName());
		result.include("monografias", monografias);
	}
	
	@Get
	public void periodico() {
		List<Publicacao> periodicos = publicacaoDao.buscaPublicacoesGenerico(Periodico.class.getName());
		result.include("periodicos", periodicos);
	}
	
	@Get
	public void anaisConferencia() {
		List<Publicacao> anais = publicacaoDao.buscaPublicacoesGenerico(AnaisConferencia.class.getName());
		result.include("anais", anais);
	}
	
	@Get
	public void artigoLivro() {
		List<Publicacao> artigosLivro = publicacaoDao.buscaPublicacoesGenerico(ArtigoLivro.class.getName());
		result.include("artigosLivro", artigosLivro);
	}
	
	@Get
	public void artigoPeriodico() {
		List<Publicacao> artigosPeriodico = publicacaoDao.buscaPublicacoesGenerico(ArtigoPeriodico.class.getName());
		result.include("artigosPeriodico", artigosPeriodico);
	}
	
	@Get
	public void artigoAnal() {
		List<Publicacao> artigosAnal = publicacaoDao.buscaPublicacoesGenerico(ArtigoAnal.class.getName());
		result.include("artigosAnal", artigosAnal);
	}
	
	@Get("/emprestimo/publicacao/{publicacao.id}")
	public void publicacao(@Load Publicacao publicacao) {
		result.include("publicacao", publicacao);
	}
	
	@Get @IncludeParameters
	public void novo(@Load Publicacao publicacao) {
		Date data = new Date(System.currentTimeMillis());
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");
		String formatRetirada = simpleDateFormat.format(data);
		result.include("dataRetirada", formatRetirada);		
		data.setDate(data.getDate()+7);
		String formatDevolucao = simpleDateFormat.format(data);
		result.include("dataDevolucao", formatDevolucao);
		
	}
	
	@Get
	public void adiciona(String titulo, String usuario, Long id, String dataDevolucao, String dataRetirada) throws ParseException {
		Usuario user = pessoaDao.busca(usuario);
		Emprestimo emprestimo = new Emprestimo();
		emprestimo.setPublicacao(publicacaoDao.buscaId(id));
		Calendar calendar = parseData(dataRetirada);
		emprestimo.setDataRetirada(calendar);
		calendar = parseData(dataDevolucao);
		emprestimo.setDataDevolucao(calendar);
		emprestimo.setUsuario(user);
		
		user.addEmprestimo(emprestimo);
		pessoaDao.atualiza(user);
		
	}
	
	private Calendar parseData(String data) throws ParseException {
		Calendar cal = Calendar.getInstance();
		cal.setTime((Date) new SimpleDateFormat("dd/MM/yyyy").parse(data));
		return cal;
	}

}
