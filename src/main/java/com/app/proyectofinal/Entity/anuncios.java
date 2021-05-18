package com.app.proyectofinal.Entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table (name = "anuncios")

public class anuncios implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idanuncios")
	private Integer idanuncios;
	
	@Column(name="anuncion_texto")
	private String anuncion_texto;
	
	@Lob
	@Column(name="imagen_anuncio")
	private String imagen_anuncio;
	
	@Column(name="fecha_aparicion")
	@Temporal(TemporalType.DATE)
	private Date fecha_aparicion;
	
	@Column(name="fecha_final")
	@Temporal(TemporalType.DATE)
	private Date fecha_final;

	public Integer getIdanuncios() {
		return idanuncios;
	}

	public void setIdanuncios(Integer idanuncios) {
		this.idanuncios = idanuncios;
	}

	public String getAnuncion_texto() {
		return anuncion_texto;
	}

	public void setAnuncion_texto(String anuncion_texto) {
		this.anuncion_texto = anuncion_texto;
	}

	public String getImagen_anuncio() {
		return imagen_anuncio;
	}

	public void setImagen_anuncio(String imagen_anuncio) {
		this.imagen_anuncio = imagen_anuncio;
	}

	public Date getFecha_aparicion() {
		return fecha_aparicion;
	}

	public void setFecha_aparicion(Date fecha_aparicion) {
		this.fecha_aparicion = fecha_aparicion;
	}

	public Date getFecha_final() {
		return fecha_final;
	}

	public void setFecha_final(Date fecha_final) {
		this.fecha_final = fecha_final;
	}	
	
}
