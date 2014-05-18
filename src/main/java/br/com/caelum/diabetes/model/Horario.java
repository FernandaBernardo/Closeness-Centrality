package br.com.caelum.diabetes.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
public class Horario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	
	@ManyToOne
	Paciente paciente;
	
	int totalInsulina;
	
	@Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
	DateTime data;
	
	@Enumerated(EnumType.STRING)
	Periodo periodo;
	
	String anotacao;
}
