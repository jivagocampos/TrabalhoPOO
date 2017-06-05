package com.sistemaacademico.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaacademico.domain.matricula.Matricula;
import com.sistemaacademico.domain.matricula.MatriculaRepository;
import com.sistemaacademico.domain.matricula.MatriculaService;

@RestController
@RequestMapping("/matricula")
public class MatriculaResource {

	private MatriculaRepository matriculaRepository;
	private MatriculaService matriculaService;

	public MatriculaResource(MatriculaRepository matriculaRepository, MatriculaService matriculaService) {
		this.matriculaRepository = matriculaRepository;
		this.matriculaService = matriculaService;
	}
	
	@GetMapping
	public Iterable<Matricula> getAllMatriculas() {
		return matriculaRepository.findAll();
	}
	
	@PostMapping
	public boolean saveMatricula(@RequestBody Matricula matricula) {
		return matriculaService.fazerMatricula(matricula);
	}
	
	@GetMapping(value = "/{id}")
	public Matricula getMatricula(@PathVariable Long id) {
		return matriculaRepository.findOne(id);
	}

	@DeleteMapping(value = "/{id}")
	public void removeMatricula(@PathVariable Long id) {
		matriculaRepository.delete(id);
	}

	@PutMapping(value = "/{id}")
	public Matricula updateMatricula(@PathVariable Long id, @RequestBody Matricula matricula) {
		return matriculaRepository.save(matricula);
	}
	
}
