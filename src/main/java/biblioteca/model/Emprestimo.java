package biblioteca.model;

import java.util.Calendar;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Emprestimo {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@Temporal(TemporalType.DATE)
	private Calendar dataRetirada;
	@Temporal(TemporalType.DATE)
	private Calendar dataDevolucao;
	@OneToOne(cascade = {CascadeType.ALL})
	private Usuario usuario;
	@OneToMany(cascade = {CascadeType.ALL})
	private List<Publicacao> emprestimos;

	public int getId() {
		return id;
	}

	public Calendar getDataRetirada() {
		return dataRetirada;
	}

	public void setDataRetirada(Calendar dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	public Calendar getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(Calendar dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Publicacao> getEmprestimos() {
		return emprestimos;
	}

	public void setEmprestimos(List<Publicacao> emprestimos) {
		this.emprestimos = emprestimos;
	}
}
