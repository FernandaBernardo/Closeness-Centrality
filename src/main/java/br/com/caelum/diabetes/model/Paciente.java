package br.com.caelum.diabetes.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;

import org.hibernate.annotations.Type;
import org.joda.time.DateTime;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
public class Paciente extends Usuario{
	@Type(type = "org.joda.time.contrib.hibernate.PersistentDateTime")
	DateTime dataAniversario;
	
	double peso;
	
	double altura;
	
	char sexo;
	
	String tipoDiabetes;
	
	@OneToMany
	private List<Lembrete> lembretes;
	
	@OneToMany
	private List<Exame> exames;
	
	@OneToMany
	private List<DadosMedicos> dadosMedicos;
	
	@OneToMany
	private List<Horario> horarios;
}
