package com.app.web.rest;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.app.web.model.Ciudadano;
import com.app.web.repository.ICiudadanoRepo;


@RestController
@RequestMapping("/citizens")
public class RestCrudController {
	
	@Autowired
	private ICiudadanoRepo repo;
	
	@GetMapping
	public List<Ciudadano>listar(){
		return repo.findAll();
	}
	
	@PostMapping
	public void instertar(@RequestBody Ciudadano ciud) {
		repo.save(ciud);
	}

	@PutMapping
	public void modificar(@RequestBody Ciudadano ciud) {
		repo.save(ciud);
	}
	
	@DeleteMapping(value = "/{id}")
	public void eliminar(@PathVariable("id") Integer  id) {
		repo.deleteById(id);
	}
	

}
