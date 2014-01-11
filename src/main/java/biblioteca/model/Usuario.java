package biblioteca.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Pessoa{
	private String cpf;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Emprestimo> emprestimos;
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
//	public List<Emprestimo> getEmprestimos() {
//		return emprestimos;
//	}
//	public void setEmprestimos(List<Emprestimo> emprestimos) {
//		this.emprestimos = emprestimos;
//	}
}
