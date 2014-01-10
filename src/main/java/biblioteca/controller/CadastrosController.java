package biblioteca.controller;

import java.sql.DriverManager;
import java.sql.SQLException;

import javax.inject.Inject;

import biblioteca.dao.PublicacaoDao;
import biblioteca.model.Livro;
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
		dao.adicionaLivro(livro);
	}
	
	@Get
	public void monografia() {
	}
	
	@Get
	public void periodico() {
	}
	
	@Get
	public void anaisConferencia() {
	}
	
	@Get
	public void artigoLivro() {
	}
	
	@Get
	public void artigoPeriodico() {
	}
	
	@Get
	public void artigoAnaisConferencia() {
	}
}
