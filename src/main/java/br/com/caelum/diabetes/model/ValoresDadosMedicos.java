package br.com.caelum.diabetes.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class ValoresDadosMedicos {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long id;
	double cafe;
	double lancheManha;
	double almoco;
	double lancheTarde;
	double jantar;
	double ceia;
	double madrugada;
}