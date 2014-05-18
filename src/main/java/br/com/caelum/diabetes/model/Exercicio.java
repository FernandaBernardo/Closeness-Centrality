package br.com.caelum.diabetes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

@Entity
public class Exercicio {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@OneToOne
	Horario horario;
	
	@NotEmpty
	String atividade;
	
	@Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
	DateTime duracao;
}
