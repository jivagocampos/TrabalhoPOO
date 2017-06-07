package com.sistemaacademico.domain.diario;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Diario {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@NotNull
	private double notaParcial;
	
	@NotNull
	private double notaOficial;
	
	@NotNull
	private boolean frequencia;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public double getNotaParcial() {
		return notaParcial;
	}

	public void setNotaParcial(double notaParcial) {
		this.notaParcial = notaParcial;
	}
	public double getNotaOficial() {
		return notaOficial;
	}

	public void setNotaOficial(double notaOficial) {
		this.notaOficial = notaOficial;
	}
	
	public boolean isFrequencia() {
		return frequencia;
	}

	public void setFrequencia(boolean frequencia) {
		this.frequencia = frequencia;
	}


	public Diario(int id, double notaParcial, double notaOficial , boolean frequencia) {
		super();
		this.id = id;
		this.notaParcial = notaParcial;
		this.notaOficial = notaOficial;
		this.frequencia = frequencia;
	}
}