package biblioteca.dao;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Usuario;
import br.com.caelum.vraptor.Result;

public class UsuarioDao {

	@Inject private Session session;
	@Inject private Result result;
	
	public void adiciona(Usuario usuario) {
		session.save(usuario);
		result.include("nome", usuario.getNome());
	}

	public Usuario busca(String nome) {
		Usuario result = (Usuario)session.createQuery("from Usuario u where u.nome=:nome").setString("nome", nome).uniqueResult();
		return result;
	}

	public void atualiza(String nomeAntigo, String nome, String cpf, String telefone) {
		Usuario usuario = busca(nomeAntigo);
		usuario.setNome(nome);
		usuario.setCpf(cpf);
		usuario.setTelefone(telefone);
		
		session.update(usuario);
		
		result.include("nome", nome);
	}
}
