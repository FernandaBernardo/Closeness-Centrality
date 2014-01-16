package biblioteca.dao;

import java.util.List;

import javax.inject.Inject;

import org.hibernate.Session;

import biblioteca.model.Emprestimo;

public class EmprestimoDao {

	@Inject Session session;
	
	public List<Emprestimo> listaEmprestimo(int usuarioId) {
		return session.createQuery("from Emprestimo where usuario_id=:id").setInteger("id", usuarioId).list();
	}

}
