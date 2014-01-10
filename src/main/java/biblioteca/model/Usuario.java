package biblioteca.model;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public class Usuario extends Pessoa{
	private String cpf;
//	@OneToMany
//	private List<Emprestimo> emprestimos;
	
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
