package com.app.web.service;

import java.util.List;


import com.app.web.model.Domicilio;

public interface IDomicilioService {

	public List<Domicilio> listarTodosLosDomicilios();
	
	public Domicilio guardarDomicilio(Domicilio domicilio);
	
	public Domicilio obtenerDomicilioById(Integer id);
	
	public Domicilio actualizarDomicilio(Domicilio domicilio);
	
	public void eliminarDomicilio(Integer id);

}
