package biblioteca.controller;

import java.util.List;

import javax.inject.Inject;

import biblioteca.dao.BibliotecaDao;
import biblioteca.dao.SecaoDao;
import biblioteca.model.Biblioteca;
import biblioteca.model.Secao;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class BibliotecaController {

	@Inject private BibliotecaDao dao;
	@Inject private Result result;
	@Inject private SecaoDao secaoDao;
	
	@Get
	public void adiciona() {
	}
	
	@Post
	public void adicionaBiblioteca(String nome, String endereco) {
			Biblioteca biblioteca = new Biblioteca();
			biblioteca.setNome(nome);
			biblioteca.setEndereco(endereco);
			
			dao.adiciona(biblioteca);
			
			result.include("tituloBiblioteca", biblioteca.getNome());
	}
	
	@Get
	public void secaoBiblioteca() {
		List<Biblioteca> bibliotecas = dao.buscaBibliotecas();
		List<Secao> secoes = secaoDao.buscaSecoes();
		result.include("bibliotecas", bibliotecas);
		result.include("secoes", secoes);
	}
	
	@Get
	public void adicionaSecao(String secao, String biblioteca) {
		Biblioteca biblio = dao.buscaBiblioteca(biblioteca);
		Secao s = secaoDao.buscaSecao(secao);
		biblio.addSecao(s);
		dao.atualizaBiblioteca(biblio);
		result.include("tituloSecao", secao);
		result.include("tituloBiblioteca", biblioteca);
	}
	
}
