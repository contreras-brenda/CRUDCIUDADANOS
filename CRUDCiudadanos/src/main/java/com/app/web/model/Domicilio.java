package com.app.web.model;


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
@Table(name="domicilio")
public class Domicilio {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(nullable = false, updatable = false)
	private Integer idDomicilio;
	
	@Column(name="calle", nullable = false, length=50)
	private String calle;
	
	@Column(name="numero", nullable = false, length=10)
	private Integer numero;
	
	@Column(name="colonia", nullable = false, length=50)
	private String colonia;

	@Column(name="tipo_domicilio", nullable = false, length=20)
	private String  tipo_domicilio;
	
	@ManyToOne()
	@JoinColumn(name = "idCiudadano")	
	private Ciudadano ciudadanos;

	@Version
	@Column(name="version")
	private Long version;

	public Integer getIdDomicilio() {
		return idDomicilio;
	}

	public void setIdDomicilio(Integer idDomicilio) {
		this.idDomicilio = idDomicilio;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getColonia() {
		return colonia;
	}

	public void setColonia(String colonia) {
		this.colonia = colonia;
	}

	public String getTipo_domicilio() {
		return tipo_domicilio;
	}

	public void setTipo_domicilio(String tipo_domicilio) {
		this.tipo_domicilio = tipo_domicilio;
	}

	public Ciudadano getCiudadanos() {
		return ciudadanos;
	}

	public void setCiudadanos(Ciudadano ciudadanos) {
		this.ciudadanos = ciudadanos;
	}

	public Long getVersion() {
		return version;
	}

	public void setVersion(Long version) {
		this.version = version;
	}


	
}