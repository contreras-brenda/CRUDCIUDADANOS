package com.app.web.service;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.web.model.Domicilio;
//import com.app.web.repository.DomicilioRepoImpl;
import com.app.web.repository.IDomicilioRepo;

@Service
public class DomicilioServiceImpl implements IDomicilioService {
	
	@Autowired
	private IDomicilioRepo repo;

	@Override
	public List<Domicilio> listarTodosLosDomicilios() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Domicilio guardarDomicilio(Domicilio domicilio) {
		// TODO Auto-generated method stub
		return repo.save(domicilio);
	}

	@Override
	public Domicilio obtenerDomicilioById(Integer id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public Domicilio actualizarDomicilio(Domicilio domicilio) {
		// TODO Auto-generated method stub
		return repo.save(domicilio);
	}

	@Override
	public void eliminarDomicilio(Integer id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
	}


}
