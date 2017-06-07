package com.sistemaacademico.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaacademico.domain.diario.Diario;
import com.sistemaacademico.domain.diario.DiarioRepository;

@RestController
@RequestMapping("/diario")
public class DiarioResource {
	
	private DiarioRepository repositorio;

	public DiarioResource(DiarioRepository repositorio) {
		super();
		this.repositorio = repositorio;
	}
	
	@PostMapping
	public Diario createDiario(@RequestBody Diario diario) {
		return repositorio.save(diario);
	}

	@GetMapping
	public Iterable<Diario> getAllDiarios() {
		return repositorio.findAll();
	}
	
	@GetMapping(value="/{id}")
	public Diario getById(@PathVariable Long id) {
		return repositorio.findOne(id);
	}
		
	@DeleteMapping(value="/{id}")
	public void removeDiario(@PathVariable Long id) {
		repositorio.delete(id);
	}
	
	@PutMapping(value = "/{id}")
	public Diario updateDiario(@PathVariable Long id, @RequestBody Diario diario) {
		return repositorio.save(diario);
	}
}
