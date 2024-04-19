package com.app.web.service;

import java.util.List;


import com.app.web.model.Ciudadano;

public interface ICiudadanoService {

	public List<Ciudadano> listarTodosLosCiudadanos();
	
	public Ciudadano guardarCiudadano(Ciudadano ciudadano);
	
	public Ciudadano obtenerCiudadanoById(Integer id);
	
	public Ciudadano actualizarCiudadano(Ciudadano ciudadano);
	
	public void eliminarCiudadano(Integer id);
	
	//public List<Ciudadano> listarTodosBusqueda(String palabraBusqueda);
}
