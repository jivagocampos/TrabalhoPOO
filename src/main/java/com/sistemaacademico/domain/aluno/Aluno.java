package com.sistemaacademico.domain.aluno;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;

import com.sistemaacademico.domain.diario.Diario;
import com.sistemaacademico.domain.matricula.Matricula;

@Entity
public class Aluno  {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull
	private String nome;

	@NotNull
	private String endereco;

	@NotNull
	private String telefone;

	@NotNull
	private int matricula;

	@NotNull
	private boolean situacao;

	@NotNull
	private String email;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Diario> diario;

	@OneToMany(cascade = CascadeType.ALL)
	private List<Matricula> matriculas;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public boolean isSituacao() {
		return situacao;
	}

	public void setSituacao(boolean situacao) {
		this.situacao = situacao;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Aluno(Long id, String nome, String endereco, String telefone, int matricula, boolean situacao,
			String email) {
		super();
		this.id = id;
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.matricula = matricula;
		this.situacao = situacao;
		this.email = email;
	}

	public List<Matricula> getMatriculas() {
		return matriculas;
	}

	public void setMatriculas(List<Matricula> matriculas) {
		this.matriculas = matriculas;
	}

	public List<Diario> getDiario() {
		return diario;
	}

	public void setFrequencia(List<Diario> diario) {
		this.diario = diario;
	}

	public Aluno(List<Diario> diario, List<Matricula> matriculas) {
		super();
		this.diario = diario;
		this.matriculas = matriculas;
	}
}