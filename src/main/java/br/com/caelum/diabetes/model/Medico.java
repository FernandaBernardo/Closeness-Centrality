package br.com.caelum.diabetes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.ManyToMany;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Medico extends Usuario {
	@NotEmpty
	String CRM;
	
	@ManyToMany
	List<Paciente> pacientes;
}
