package com.sistemaacademico.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaacademico.domain.aluno.Aluno;
import com.sistemaacademico.domain.aluno.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoResource {

	private AlunoRepository alunoRepository;
	
	public AlunoResource(AlunoRepository alunoRepository) {
		this.alunoRepository = alunoRepository;
	}
	
	@GetMapping
	public Iterable<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Aluno getById(@PathVariable Long id) {
		return alunoRepository.findOne(id);
	}
	
	@PostMapping
	public Aluno createAluno(@RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}	
	
	@PutMapping(value="/{id}")
	public Aluno updateAluno(@PathVariable Long id, @RequestBody Aluno aluno) {
		return alunoRepository.save(aluno);
	}
	
	@DeleteMapping(value="/{id}")
	public void removeAluno(@PathVariable Long id) {
		alunoRepository.delete(id);
	}	
}