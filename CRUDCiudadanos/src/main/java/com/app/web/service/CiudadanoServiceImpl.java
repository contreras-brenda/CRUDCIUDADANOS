package com.app.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.model.Ciudadano;
import com.app.web.repository.ICiudadanoRepo;

@Service
public class CiudadanoServiceImpl implements ICiudadanoService {
	
	@Autowired
	private ICiudadanoRepo repo;

	@Override
	public List<Ciudadano> listarTodosLosCiudadanos() {
		return repo.findAll();
	}

	@Override
	public Ciudadano guardarCiudadano(Ciudadano ciudadano) {
		return repo.save(ciudadano);
	}

	@Override
	public Ciudadano obtenerCiudadanoById(Integer id) {
		return repo.findById(id).get();
	}

	@Override
	public Ciudadano actualizarCiudadano(Ciudadano ciudadano) {
		return repo.save(ciudadano);
	}

	@Override
	public void eliminarCiudadano(Integer id) {
		repo.deleteById(id);
	}


	/*@Override
	public List<Ciudadano> listarTodosBusqueda(String palabraBusqueda) {
		if(palabraBusqueda != null) {
			return repo.findAll(palabraBusqueda);
		}
		return repo.findAll();
	}*/
		
	

}
