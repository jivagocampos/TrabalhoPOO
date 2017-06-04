package com.sistemaacademico.domain.turma;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.aluno.Aluno;
import com.sistemaacademico.domain.curso.Curso;
import com.sistemaacademico.domain.semestre.Semestre;

@Entity
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;

	@NotNull
	private String nome;

	@OneToMany
	private List<Aluno> alunos;

	@NotNull
	private int limiteAluno;

	@NotNull
	private boolean situacao;

	@NotNull
	@ManyToOne
	private Semestre semestre;

	@NotNull
	@ManyToOne
	private Curso curso;

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getAlunos() {
		return alunos;
	}

	public void setAlunos(List<Aluno> alunos) {
		this.alunos = alunos;
	}

	public int getLimiteAluno() {
		return limiteAluno;
	}

	public void setLimiteAluno(int limiteAluno) {
		this.limiteAluno = limiteAluno;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public Semestre getSemestre() {
		return semestre;
	}

	public void setSemestre(Semestre semestre) {
		this.semestre = semestre;
	}

	public Turma(int id, String nome, List<Aluno> alunos, int limiteAluno, boolean situacao, Semestre semestre,
			Curso curso) {
		super();
		this.id = id;
		this.nome = nome;
		this.alunos = alunos;
		this.limiteAluno = limiteAluno;
		this.situacao = situacao;
		this.semestre = semestre;
		this.curso = curso;
	}

	public Turma() {
		super();
	}

}
