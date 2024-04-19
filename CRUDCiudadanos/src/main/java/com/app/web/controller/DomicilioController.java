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


import com.app.web.model.Ciudadano;
import com.app.web.model.Domicilio;

import com.app.web.service.ICiudadanoService;
import com.app.web.service.IDomicilioService;
import com.app.web.repository.ICiudadanoRepo;


@Controller
public class DomicilioController {

	@Autowired
	private IDomicilioService servicio;
	
	
	@GetMapping({"/domicilios"})
	public String listarDomicilios(Model model) {
		model.addAttribute("domicilios", servicio.listarTodosLosDomicilios());
		return "domicilios";
	}
	
	
	@GetMapping({"/domicilios/nuevo"})
	public String agregarDomicilio(Model model){
		Domicilio domicilio = new Domicilio();
		model.addAttribute("domicilio",new Domicilio());
		return "agregar_domicilio";
	}
	
	@PostMapping({"/domicilios"})
	public String guardarDomicilio(@ModelAttribute("domicilio")Domicilio domicilio){
		servicio.guardarDomicilio(domicilio);
		return "redirect:/domicilios";
	}
	

	@GetMapping("/domicilios/editar/{id}")
	public String formularioEditar(@PathVariable Integer id, Model model){
		model.addAttribute("domicilio", servicio.obtenerDomicilioById(id));
		return "editar_domicilio";
	}

	@PostMapping("/domicilios/{id}")
	public String actualizarDomicilio(@PathVariable Integer id, @ModelAttribute("domicilio")Domicilio domicilio, Model model){
		Domicilio domicilioParaModificar = servicio.obtenerDomicilioById(id);
		domicilioParaModificar.setIdDomicilio(id);
		domicilioParaModificar.setCalle(domicilio.getCalle());
		domicilioParaModificar.setNumero(domicilio.getNumero());
		domicilioParaModificar.setColonia(domicilio.getColonia());
		domicilioParaModificar.setCiudadanos(domicilio.getCiudadanos());
		domicilioParaModificar.setTipo_domicilio(domicilio.getTipo_domicilio());
        servicio.actualizarDomicilio(domicilioParaModificar);
		return "redirect:/domicilios";
     }
	
	@GetMapping("/domicilios/{id}")
	public String eliminarDomicilio(@PathVariable Integer id) {
		servicio.eliminarDomicilio(id);
		return"redirect:/domicilios";
	}
	
}
