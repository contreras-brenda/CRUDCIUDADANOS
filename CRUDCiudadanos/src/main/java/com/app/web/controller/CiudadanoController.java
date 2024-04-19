package com.app.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


import com.app.web.model.Ciudadano;
import com.app.web.model.Domicilio;
import com.app.web.service.ICiudadanoService;

@Controller
public class CiudadanoController {

	@Autowired
	private ICiudadanoService servicio;
	
	
	@GetMapping({"/ciudadanos","/"})
	public String listarCiudadanos(Model model) {
		model.addAttribute("ciudadanos", servicio.listarTodosLosCiudadanos());
		return "ciudadanos";
	}
	
	@GetMapping({"/ciudadanos/nuevo"})
	public String agregarCiudadano(Model model){
		Ciudadano ciudadano = new Ciudadano();
		model.addAttribute("ciudadano",new Ciudadano());
		return "agregar_ciudadano";
	}
	
	@PostMapping({"/ciudadanos"})
	public String guardarCiudadano(@ModelAttribute("ciudadano")Ciudadano ciudadano){
		servicio.guardarCiudadano(ciudadano);
		return "redirect:/ciudadanos";
	}
	

	@GetMapping("/ciudadanos/editar/{id}")
	public String formularioEditar(@PathVariable Integer id, Model model){
		model.addAttribute("ciudadano", servicio.obtenerCiudadanoById(id));
		return "editar_ciudadano";
	}

	@PostMapping("/ciudadanos/{id}")
	public String actualizarCiudadano(@PathVariable Integer id, @ModelAttribute("ciudadano")Ciudadano ciudadano, Model model){
		Ciudadano ciudadanoParaModificar = servicio.obtenerCiudadanoById(id);
		ciudadanoParaModificar.setIdCiudadano(id);
		ciudadanoParaModificar.setNombre(ciudadano.getNombre());
		ciudadanoParaModificar.setApellido_paterno(ciudadano.getApellido_paterno());
		ciudadanoParaModificar.setApellido_materno(ciudadano.getApellido_materno());
		ciudadanoParaModificar.setFecha_nacimiento(ciudadano.getFecha_nacimiento());
        servicio.actualizarCiudadano(ciudadanoParaModificar);
		return "redirect:/ciudadanos";
     }
	
	@GetMapping("/ciudadanos/{id}")
	public String eliminarCiudadano(@PathVariable Integer id) {
		servicio.eliminarCiudadano(id);
		return"redirect:/ciudadanos";
	}
	
}
