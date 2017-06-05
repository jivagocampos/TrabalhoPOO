package com.sistemaacademico.domain.matricula;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.aluno.Aluno;
import com.sistemaacademico.domain.disciplina.Disciplina;
import com.sistemaacademico.domain.turma.Turma;

@Entity
public class Matricula {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "matricula_sequence")
	@SequenceGenerator(name = "matricula_sequence", sequenceName = "matricula_sequence")
	private Long id;
	@ManyToOne
	@NotNull
	private Aluno aluno;
	@ManyToOne
	@NotNull
	private Disciplina disciplina;
	
	@ManyToOne
	@NotNull
	private Turma turma;
	
	@NotNull
	@Temporal(TemporalType.DATE)
	private Date data;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public Turma getTurma() {
		return turma;
	}

	public void setTurma(Turma turma) {
		this.turma = turma;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Matricula(Long id, Aluno aluno, Disciplina disciplina, Turma turma, Date data) {
		super();
		this.id = id;
		this.aluno = aluno;
		this.disciplina = disciplina;
		this.turma = turma;
		this.data = data;
	}

	public Matricula() {
		super();
	}
}