package br.com.caelum.diabetes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
public class DadosMedicos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@ManyToOne
	Paciente paciente;
	
	@Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
	DateTime data;
	
	@OneToOne
	ValoresDadosMedicos glicemiaAlvo;
	
	@OneToOne
	ValoresDadosMedicos correcao;
	
	@OneToOne
	ValoresDadosMedicos contagem;
	
	@OneToOne
	ValoresDadosMedicos basal;
}
