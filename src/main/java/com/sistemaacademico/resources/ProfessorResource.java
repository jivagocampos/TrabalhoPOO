package com.sistemaacademico.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaacademico.domain.professor.Professor;
import com.sistemaacademico.domain.professor.ProfessorRepository;

@RestController
@RequestMapping("/professor")
public class ProfessorResource {

	private ProfessorRepository repositorio;

	public ProfessorResource(ProfessorRepository repositorio) {
		super();
		this.repositorio = repositorio;
	}
	
	@PostMapping
	public Professor createProfessor(@RequestBody Professor professor) {
		return repositorio.save(professor);
	}

	@GetMapping
	public Iterable<Professor> getAllProfessors() {
		return repositorio.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Professor getById(@PathVariable Long id) {
		return repositorio.findOne(id);
	}
		
	@DeleteMapping(value="/{id}")
	public void removeProfessor(@PathVariable Long id) {
		repositorio.delete(id);
	}
	
	@PutMapping(value = "/{id}")
	public Professor updateProfessor(@PathVariable Long id, @RequestBody Professor professor) {
		return repositorio.save(professor);
	}
}
