package com.sistemaacademico.domain.aluno;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.diario.Frequencia;
import com.sistemaacademico.domain.disciplina.Disciplina;
import com.sistemaacademico.domain.matricula.Matricula;
import com.sistemaacademico.domain.pessoa.Pessoa;

@Entity
public class Aluno extends Pessoa {

	@NotNull
	private int cadastro;

	@NotNull
	private boolean situacao;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Frequencia> frequencia;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Disciplina> disciplina;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Matricula> matriculas;

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public int getCadastro() {
		return cadastro;
	}

	public void setCadastro(int cadastro) {
		this.cadastro = cadastro;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public List<Frequencia> getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(List<Frequencia> frequencia) {
		this.frequencia = frequencia;
	}

	public List<Disciplina> getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(List<Disciplina> disciplina) {
		this.disciplina = disciplina;
	}

	public Aluno(Long id, String nome, String endereco, String telefone, String email,  int cadastro, boolean situacao,
			List<Frequencia> frequencia, List<Disciplina> disciplina,
			List<Matricula> matriculas) {
		super(id, nome, endereco, telefone, email);
		this.cadastro = cadastro;
		this.situacao = situacao;
		this.frequencia = frequencia;
		this.disciplina = disciplina;
		this.matriculas = matriculas;
	}

	public Aluno(Long id, String nome, String endereco, String telefone, String email) {
		super(id, nome, endereco, telefone, email);
	}

	public Aluno() {
		super();
	}
}