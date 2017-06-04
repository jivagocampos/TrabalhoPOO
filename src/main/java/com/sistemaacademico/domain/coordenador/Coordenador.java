package com.sistemaacademico.domain.coordenador;

import javax.persistence.Entity;

import com.sistemaacademico.domain.funcionario.Funcionario;

@Entity
public class Coordenador extends Funcionario{

	public Coordenador(Long id, String nome, String endereco, String telefone, String email) {
		super(id, nome, endereco, telefone, email);
	}
}