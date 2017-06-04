package com.sistemaacademico.domain.diario;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.disciplina.Disciplina;

@Entity
public class Frequencia {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@NotNull
	private boolean presente;
	
	@NotNull
	@ManyToOne
	private Disciplina disciplina;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public boolean isPresente() {
		return presente;
	}

	public void setPresente(boolean presente) {
		this.presente = presente;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Frequencia(int id, Date data, boolean presente, Disciplina disciplina) {
		super();
		this.id = id;
		this.data = data;
		this.presente = presente;
		this.disciplina = disciplina;
	}

	public Frequencia() {
		super();
	}

}
