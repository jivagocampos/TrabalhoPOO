package com.sistemaacademico.domain.curso;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.disciplina.Disciplina;

@Entity
public class Curso {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	@NotNull
	private String descricao;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Disciplina> disciplinas;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	public Curso(Long id, String descricao, List<Disciplina> disciplinas) {
		super();
		this.id = id;
		this.descricao = descricao;
		this.disciplinas = disciplinas;
	}
}
