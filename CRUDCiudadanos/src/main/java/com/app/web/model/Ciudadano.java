package com.app.web.model;

import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name="ciudadanos")
public class Ciudadano {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="Integer")
	@Column(nullable = false, updatable = false)
	private Integer idCiudadano;
	
	@Column(name="nombre", nullable = false, length=50)
	private String nombre;
	
	@Column(name="apellido_paterno", nullable = false, length=50)
	private String apellido_paterno;
	
	@Column(name="apellido_materno", nullable = false, length=50)
	private String apellido_materno;
	
	@Column(name="fecha_nacimiento:", nullable= false)
	private Date fecha_nacimiento;

	
	@Version
	@Column(name="version")
	private Long version;

	public Integer getIdCiudadano() {
		return idCiudadano;
	}

	public void setIdCiudadano(Integer idCiudadano) {
		this.idCiudadano = idCiudadano;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido_paterno() {
		return apellido_paterno;
	}

	public void setApellido_paterno(String apellido_paterno) {
		this.apellido_paterno = apellido_paterno;
	}

	public String getApellido_materno() {
		return apellido_materno;
	}

	public void setApellido_materno(String apellido_materno) {
		this.apellido_materno = apellido_materno;
	}

	public Date getFecha_nacimiento() {
		return fecha_nacimiento;
	}

	public void setFecha_nacimiento(Date fecha_nacimiento) {
		this.fecha_nacimiento = fecha_nacimiento;
	}


	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}

	/*public Ciudadano(String nombre, String apellido_paterno, String apellido_materno, Date fecha_nacimiento,
			Direcciones direcciones, Long version) {
		super();
		this.nombre = nombre;
		this.apellido_paterno = apellido_paterno;
		this.apellido_materno = apellido_materno;
		this.fecha_nacimiento = fecha_nacimiento;
		this.direcciones = direcciones;
		this.version = version;
	}*/



}
