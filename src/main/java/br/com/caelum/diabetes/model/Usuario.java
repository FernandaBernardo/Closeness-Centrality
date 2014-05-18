package br.com.caelum.diabetes.model;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;
import org.joda.time.DateTime;

@MappedSuperclass
public class Usuario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@NotEmpty
	private String senha;
	
	@NotEmpty
	private String nome;
	
	@Email
	private String email;
	
	@Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
	DateTime dataInicio;
}
