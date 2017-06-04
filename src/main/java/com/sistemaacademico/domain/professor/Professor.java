package com.sistemaacademico.domain.professor;

import javax.persistence.Entity;

import com.sistemaacademico.domain.funcionario.Funcionario;

@Entity
public class Professor extends Funcionario {

	public Professor(Long id, String nome, String endereco, String telefone, String email) {
		super(id, nome, endereco, telefone, email);
	}
}