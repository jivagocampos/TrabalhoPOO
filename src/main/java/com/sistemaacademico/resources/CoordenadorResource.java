package com.sistemaacademico.resources;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sistemaacademico.domain.coordenador.Coordenador;
import com.sistemaacademico.domain.coordenador.CoordenadorRepository;

@RestController
@RequestMapping("/coordenador")
public class CoordenadorResource {

	private CoordenadorRepository repositorio;

	public CoordenadorResource(CoordenadorRepository repositorio) {
		super();
		this.repositorio = repositorio;
	}

	@GetMapping
	public Iterable<Coordenador> getAllCoordenadores() {
		return repositorio.findAll();
	}

	@GetMapping(value = "/{id}")
	public Coordenador getById(@PathVariable Long id) {
		return repositorio.findOne(id);
	}
	
	@PostMapping
	public Coordenador createCoordenador(@RequestBody Coordenador coordenador) {
		return repositorio.save(coordenador);
	}

	@PutMapping(value = "/{id}")
	public Coordenador updateCoordenador(@PathVariable Long id, @RequestBody Coordenador coordenador) {
		return repositorio.save(coordenador);
	}

	@DeleteMapping(value = "/{id}")
	public void removeCoordenador(@PathVariable Long id) {
		repositorio.delete(id);
	}
}
