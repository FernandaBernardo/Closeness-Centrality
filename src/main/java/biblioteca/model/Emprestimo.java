package biblioteca.model;

import java.util.Calendar;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
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
	@ManyToOne(cascade = {CascadeType.ALL})
	private Usuario usuario;
	@OneToOne(cascade = {CascadeType.ALL})
	private Publicacao publicacao;

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

	public Publicacao getPublicacao() {
		return publicacao;
	}

	public void setPublicacao(Publicacao publicacao) {
		this.publicacao = publicacao;
	}
}
