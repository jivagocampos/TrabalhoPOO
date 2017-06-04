package com.sistemaacademico.resources;

import java.util.Collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaacademico.domain.disciplina.Disciplina;
import com.sistemaacademico.domain.historico.Historico;
import com.sistemaacademico.domain.historico.HistoricoRepository;

@RestController
@RequestMapping("/historico")
public class HistoricoResource {

	private HistoricoRepository historicoRepository;

	public HistoricoResource(HistoricoRepository historicoRepository) {
		this.historicoRepository = historicoRepository;
	}
	
	@GetMapping
	public Iterable<Historico> getAllHistorico() {
		return historicoRepository.findAll();
	}
	
	@PostMapping
	public Historico saveHistorico(@RequestBody Historico historico) {
		return historicoRepository.save(historico);
	}
	
	@PostMapping(value="/aprovado")
	public Collection<Historico> getAprovados(@RequestBody Collection<Disciplina> disciplinas) {
		return historicoRepository.findByDisciplinaInAndAprovadoTrue(disciplinas);
	}
	
}

