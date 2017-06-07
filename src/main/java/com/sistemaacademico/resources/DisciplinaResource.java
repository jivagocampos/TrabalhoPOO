package com.sistemaacademico.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaacademico.domain.disciplina.Disciplina;
import com.sistemaacademico.domain.disciplina.DisciplinaRepository;

@RestController
@RequestMapping("/disciplina")
public class DisciplinaResource {

	private DisciplinaRepository disciplinaRepository;

	public DisciplinaResource(DisciplinaRepository disciplinaRepository){
		this.disciplinaRepository = disciplinaRepository;
	}
	
	@GetMapping
	public Iterable<Disciplina> getAllDisciplinas() {
		return disciplinaRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Disciplina getById(@PathVariable Long id) {
		return disciplinaRepository.findOne(id);
	}
	
	@PostMapping
	public Disciplina createDisciplina(@RequestBody Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}
	
	@PutMapping(value = "/{id}")
	public Disciplina updateDisciplina(@PathVariable Long id, @RequestBody Disciplina disciplina) {
		return disciplinaRepository.save(disciplina);
	}
			
	@DeleteMapping(value="/{id}")
	public void removeDisciplina(@PathVariable Long id) {
		disciplinaRepository.delete(id);
	}
}
