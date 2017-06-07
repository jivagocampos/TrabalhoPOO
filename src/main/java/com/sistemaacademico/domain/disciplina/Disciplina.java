package com.sistemaacademico.domain.disciplina;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.validation.constraints.NotNull;

@Entity
public class Disciplina {

	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="disciplina_sequence")
	@SequenceGenerator(name="disciplina_sequence", allocationSize= 1, sequenceName="disciplina_sequence")
	private Long id;
	@NotNull
	private String nome;
	private String descricao;
	@NotNull
	private int cargaHoraria;
	@NotNull
	private String ementa;
	@OneToMany
	private Collection<Disciplina> dependencias;
	

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public int getCargaHoraria() {
		return cargaHoraria;
	}

	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	public String getEmenta() {
		return ementa;
	}

	public void setEmenta(String ementa) {
		this.ementa = ementa;
	}

	public Collection<Disciplina> getDependencias() {
		return dependencias;
	}

	public void setDependencias(Collection<Disciplina> dependencias) {
		this.dependencias = dependencias;
	}

	public Disciplina(Long id, String nome, String descricao, int cargaHoraria, String ementa,
			Collection<Disciplina> dependencias) {
		super();
		this.id = id;
		this.nome = nome;
		this.descricao = descricao;
		this.cargaHoraria = cargaHoraria;
		this.ementa = ementa;
		this.dependencias = dependencias;		
	}
}