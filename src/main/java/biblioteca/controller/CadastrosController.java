package biblioteca.controller;

import javax.inject.Inject;

import biblioteca.dao.PublicacaoDao;
import biblioteca.model.AnaisConferencia;
import biblioteca.model.Livro;
import biblioteca.model.Monografia;
import biblioteca.model.Periodico;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;

@Controller
public class CadastrosController {
	
	@Inject private PublicacaoDao dao;

	@Get
	public void livro() {
	}
	
	@Post
	public void adicionaLivro(Livro livro) {
		dao.adiciona(livro);
	}
	
	@Get
	public void monografia() {
	}
	
	@Post
	public void adicionaMonografia(Monografia monografia) {
		dao.adiciona(monografia);
	}
	
	@Get
	public void periodico() {
	}
	
	@Post
	public void adicionaPeriodico(Periodico periodico) {
		dao.adiciona(periodico);
	}
	
	@Get
	public void anaisConferencia() {
	}
	
	@Post
	public void adicionaAnaisConferencia(AnaisConferencia anaisConferencia) {
		dao.adiciona(anaisConferencia);
	}
	
	@Get
	public void artigoLivro() {
	}
	
//	@Post
//	public void adicionaArtigoLivro(ArtigoLivro artigoLivro) {
//		dao.adiciona(artigoLivro);
//	}
	
	@Get
	public void artigoPeriodico() {
	}
	
//	@Post
//	public void adicionaArtigoPeriodico(ArtigoPeriodico artigoPeriodico) {
//		dao.adiciona(artigoPeriodico);
//	}
	
	@Get
	public void artigoAnal() {
	}
	
//	@Post
//	public void adicionaArtigoAnal(ArtigoAnaisConferencia artigoAnaisConferencia) {
//		dao.adiciona(aritogAnaisConferencia);
//	}
}
