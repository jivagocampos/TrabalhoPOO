package com.sistemaacademico.domain.turma;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.semestre.Semestre;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private int ano;

	@NotNull
	@ManyToOne
	private Semestre semestre;

	@NotNull
	private int diaSemana;

	@NotNull
	private String horario;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public int getDiaSemana() {
		return diaSemana;
	}

	public void setDiaSemana(int diaSemana) {
		this.diaSemana = diaSemana;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public Turma(int id, int ano, Semestre semestre, int diaSemana, String horario) {
		super();
		this.id = id;
		this.ano = ano;
		this.semestre = semestre;
		this.diaSemana = diaSemana;
		this.horario = horario;
	}
}
