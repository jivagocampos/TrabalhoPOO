package com.sistemaacademico.domain.funcionario;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.pessoa.Pessoa;

@Entity
public class Funcionario extends Pessoa {

	@NotNull
	private String formacao;

	@NotNull
	private double cargaHoraria;

	public String getFormacao() {
		return formacao;
	}

	public void setFormacao(String formacao) {
		this.formacao = formacao;
	}

	public double getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(double cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public Funcionario(Long id, String nome, String endereco, String telefone, String email, String formacao,
			double cargaHoraria) {
		super(id, nome, endereco, telefone, email);
		this.formacao = formacao;
		this.cargaHoraria = cargaHoraria;
	}

	public Funcionario(Long id, String nome, String endereco, String telefone, String email) {
		super(id, nome, endereco, telefone, email);
	}
}
