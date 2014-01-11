package biblioteca.controller;

import javax.inject.Inject;

import biblioteca.dao.UsuarioDao;
import biblioteca.model.Usuario;
import br.com.caelum.vraptor.Controller;
import br.com.caelum.vraptor.Get;
import br.com.caelum.vraptor.Post;
import br.com.caelum.vraptor.Result;

@Controller
public class UsuarioController {
	
	@Inject private UsuarioDao dao;
	@Inject private Result result;
	
	@Get
	public void cadastro(){
	}
	
	@Post
	public void adiciona(Usuario usuario){
		dao.adiciona(usuario);
		result.include("nome", usuario.getNome());
	}
}
