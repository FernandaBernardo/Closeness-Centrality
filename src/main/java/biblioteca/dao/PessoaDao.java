package biblioteca.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Autor;
import biblioteca.model.Publicacao;
import biblioteca.model.Usuario;

public class PessoaDao {

	@Inject private Session session;
	
	public void adicionaUsuario(Usuario usuario) {
		session.save(usuario);
	}
	
	public void adicionaAutor(Autor autor) {
		session.save(autor);
	}

	public Usuario busca(String nome) {
		Usuario result = (Usuario)session.createQuery("from Usuario u where u.nome=:nome").setString("nome", nome).uniqueResult();
		return result;
	}

	public void atualiza(Usuario usuario) {
		session.update(usuario);
	}

	public void atualiza(Autor autor) {
		session.update(autor);
	}

	public List<Autor> buscaTodosAutores() {
		return session.createQuery("from Autor").list();
	}

	public List<Usuario> buscaPorPublicacao(Publicacao publicacao) {
		return session.createQuery("select e.usuario from Emprestimo e where e.publicacao = :publicacao").setEntity("publicacao", publicacao).list();
	}

}
