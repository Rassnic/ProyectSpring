package com.app.proyectofinal.Entity;

import java.io.Serializable;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table (name = "producto")
public class producto implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 9L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name="idproducto")
	private Integer idproducto;
	
	@Column(name="nombre_producto")
	private String nombre_producto;
	
	@Column(name="descripcion")
	private String descripcion;
	
	@Column(name="costo_unitario")
	private Double costo_unitario;
	
	@Column(name="cantidad_disponible")
	private Integer cantidad_disponible;
	
	@Lob
	@Column(name="imagen_producto")
	private String imagen_producto;

	public Integer getIdproducto() {
		return idproducto;
	}

	public void setIdproducto(Integer idproducto) {
		this.idproducto = idproducto;
	}

	public String getNombre_producto() {
		return nombre_producto;
	}

	public void setNombre_producto(String nombre_producto) {
		this.nombre_producto = nombre_producto;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public Double getCosto_unitario() {
		return costo_unitario;
	}

	public void setCosto_unitario(Double costo_unitario) {
		this.costo_unitario = costo_unitario;
	}

	public Integer getCantidad_disponible() {
		return cantidad_disponible;
	}

	public void setCantidad_disponible(Integer cantidad_disponible) {
		this.cantidad_disponible = cantidad_disponible;
	}

	public String getImagen_producto() {
		return imagen_producto;
	}

	public void setImagen_producto(String imagen_producto) {
		this.imagen_producto = imagen_producto;
	}

}
