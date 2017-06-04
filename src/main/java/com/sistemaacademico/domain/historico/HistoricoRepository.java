package com.sistemaacademico.domain.historico;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;

import com.sistemaacademico.domain.disciplina.Disciplina;

public interface HistoricoRepository extends CrudRepository<Historico, Long>{
	
	public Collection<Historico>findByDisciplinaInAndAprovadoTrue(Collection<Disciplina> disciplinas);
	
}
