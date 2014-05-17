package br.com.caelum.diabetes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Alimento {
	@Id
	@GeneratedValue
	Long id;
	String nome;
	double carboidrato;
}
